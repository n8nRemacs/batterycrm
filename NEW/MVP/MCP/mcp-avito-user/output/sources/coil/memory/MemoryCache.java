package coil.memory;

import Y61.k;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import coil.util.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MemoryCache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil/memory/MemoryCache;", "", "a", "Key", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface MemoryCache {

    /* compiled from: MemoryCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$a;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Context f58516a;

        /* renamed from: b, reason: collision with root package name */
        public double f58517b;

        /* renamed from: c, reason: collision with root package name */
        public int f58518c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f58519d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f58520e;

        public a(@k Context context) {
            this.f58516a = context;
            Bitmap.Config[] configArr = l.f58781a;
            double d12 = 0.2d;
            try {
                if (((ActivityManager) androidx.core.content.d.getSystemService(context, ActivityManager.class)).isLowRamDevice()) {
                    d12 = 0.15d;
                }
            } catch (Exception unused) {
            }
            this.f58517b = d12;
            this.f58519d = true;
            this.f58520e = true;
        }

        @k
        public final d a() {
            g aVar;
            int i12;
            int largeMemoryClass;
            h fVar = this.f58520e ? new f() : new coil.memory.b();
            if (this.f58519d) {
                double d12 = this.f58517b;
                if (d12 > 0.0d) {
                    Context context = this.f58516a;
                    Bitmap.Config[] configArr = l.f58781a;
                    try {
                        ActivityManager activityManager = (ActivityManager) androidx.core.content.d.getSystemService(context, ActivityManager.class);
                        largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused) {
                        largeMemoryClass = 256;
                    }
                    double d13 = d12 * largeMemoryClass;
                    double d14 = 1024;
                    i12 = (int) (d13 * d14 * d14);
                } else {
                    i12 = this.f58518c;
                }
                aVar = i12 > 0 ? new e(i12, fVar) : new coil.memory.a(fVar);
            } else {
                aVar = new coil.memory.a(fVar);
            }
            return new d(aVar, fVar);
        }
    }

    void a(int i12);

    @Y61.l
    b b(@k Key key);

    void c(@k Key key, @k b bVar);

    /* compiled from: MemoryCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key implements Parcelable {

        @X41.f
        @k
        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f58514b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, String> f58515c;

        /* compiled from: MemoryCache.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"coil/memory/MemoryCache$Key$a", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Key> {
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i12) {
                return new Key[i12];
            }
        }

        /* compiled from: MemoryCache.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/memory/MemoryCache$Key$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "CREATOR", "Landroid/os/Parcelable$Creator;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new b(null);
            CREATOR = new a();
        }

        public Key(@k String str, @k Map<String, String> map) {
            this.f58514b = str;
            this.f58515c = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (L.f(this.f58514b, key.f58514b) && L.f(this.f58515c, key.f58515c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f58515c.hashCode() + (this.f58514b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(key=");
            sb2.append(this.f58514b);
            sb2.append(", extras=");
            return r.w(sb2, this.f58515c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f58514b);
            Map<String, String> map = this.f58515c;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? P0.c() : map);
        }
    }

    /* compiled from: MemoryCache.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bitmap f58521a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f58522b;

        public b(@k Bitmap bitmap, @k Map<String, ? extends Object> map) {
            this.f58521a = bitmap;
            this.f58522b = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (L.f(this.f58521a, bVar.f58521a) && L.f(this.f58522b, bVar.f58522b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f58522b.hashCode() + (this.f58521a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(bitmap=");
            sb2.append(this.f58521a);
            sb2.append(", extras=");
            return r.w(sb2, this.f58522b, ')');
        }

        public /* synthetic */ b(Bitmap bitmap, Map map, int i12, C42822w c42822w) {
            this(bitmap, (i12 & 2) != 0 ? P0.c() : map);
        }
    }
}
