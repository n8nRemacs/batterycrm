package com.avito.android.photo_picker.camera_mvi.mvi.entity;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CameraState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState;", "", "a", "CameraType", "b", "Flash", "c", "Ratio", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CameraState {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final b f219143m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final CameraState f219144n;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f219145a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Ratio f219146b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Ratio f219147c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Flash f219148d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CameraType f219149e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f219150f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f219151g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final c f219152h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f219153i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f219154j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f219155k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f219156l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$CameraType;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CameraType {

        /* renamed from: b, reason: collision with root package name */
        public static final CameraType f219157b;

        /* renamed from: c, reason: collision with root package name */
        public static final CameraType f219158c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CameraType[] f219159d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f219160e;

        static {
            CameraType cameraType = new CameraType("BACK", 0);
            f219157b = cameraType;
            CameraType cameraType2 = new CameraType("FRONT", 1);
            f219158c = cameraType2;
            CameraType[] cameraTypeArr = {cameraType, cameraType2};
            f219159d = cameraTypeArr;
            f219160e = kotlin.enums.c.a(cameraTypeArr);
        }

        public CameraType() {
            throw null;
        }

        public static CameraType valueOf(String str) {
            return (CameraType) Enum.valueOf(CameraType.class, str);
        }

        public static CameraType[] values() {
            return (CameraType[]) f219159d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$Flash;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Flash {

        /* renamed from: c, reason: collision with root package name */
        public static final Flash f219161c;

        /* renamed from: d, reason: collision with root package name */
        public static final Flash f219162d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Flash[] f219163e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f219164f;

        /* renamed from: b, reason: collision with root package name */
        public final int f219165b;

        static {
            Flash flash = new Flash("ON", 0, R.attr.ic_lightOn24);
            f219161c = flash;
            Flash flash2 = new Flash("OFF", 1, R.attr.ic_lightOff24);
            f219162d = flash2;
            Flash[] flashArr = {flash, flash2};
            f219163e = flashArr;
            f219164f = kotlin.enums.c.a(flashArr);
        }

        public Flash(@InterfaceC42150f String str, int i12, int i13) {
            this.f219165b = i13;
        }

        public static Flash valueOf(String str) {
            return (Flash) Enum.valueOf(Flash.class, str);
        }

        public static Flash[] values() {
            return (Flash[]) f219163e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$Ratio;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ratio {

        /* renamed from: c, reason: collision with root package name */
        public static final Ratio f219166c;

        /* renamed from: d, reason: collision with root package name */
        public static final Ratio f219167d;

        /* renamed from: e, reason: collision with root package name */
        public static final Ratio f219168e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Ratio[] f219169f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f219170g;

        /* renamed from: b, reason: collision with root package name */
        public final int f219171b;

        static {
            Ratio ratio = new Ratio("R1x1", 0, R.attr.ic_reso_1_1);
            f219166c = ratio;
            Ratio ratio2 = new Ratio("R3x4", 1, R.attr.ic_reso_3_4);
            f219167d = ratio2;
            Ratio ratio3 = new Ratio("R4x3", 2, R.attr.ic_reso_4_3);
            f219168e = ratio3;
            Ratio[] ratioArr = {ratio, ratio2, ratio3};
            f219169f = ratioArr;
            f219170g = kotlin.enums.c.a(ratioArr);
        }

        public Ratio(@InterfaceC42150f String str, int i12, int i13) {
            this.f219171b = i13;
        }

        public static Ratio valueOf(String str) {
            return (Ratio) Enum.valueOf(Ratio.class, str);
        }

        public static Ratio[] values() {
            return (Ratio[]) f219169f.clone();
        }
    }

    /* compiled from: CameraState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a;", "", "a", "b", "c", "d", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$b;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$c;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$d;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: CameraState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6586a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f219172a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f219173b;

            public C6586a(@k PrintableText printableText, @k PrintableText printableText2) {
                this.f219172a = printableText;
                this.f219173b = printableText2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6586a)) {
                    return false;
                }
                C6586a c6586a = (C6586a) obj;
                return L.f(this.f219172a, c6586a.f219172a) && L.f(this.f219173b, c6586a.f219173b);
            }

            public final int hashCode() {
                return this.f219173b.hashCode() + (this.f219172a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(title=");
                sb2.append(this.f219172a);
                sb2.append(", description=");
                return AK.c.m(sb2, this.f219173b, ')');
            }
        }

        /* compiled from: CameraState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$b;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f219174a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1402025909;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: CameraState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$c;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f219175a;

            public c(boolean z12) {
                this.f219175a = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f219175a == ((c) obj).f219175a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f219175a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("RequirePermission(isNeedShowSettings="), this.f219175a, ')');
            }
        }

        /* compiled from: CameraState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a$d;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f219176a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 689121042;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: CameraState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$b;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CameraState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState$c;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Bitmap f219177a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bitmap f219178b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bitmap f219179c;

        public c() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f219177a, cVar.f219177a) && L.f(this.f219178b, cVar.f219178b) && L.f(this.f219179c, cVar.f219179c);
        }

        public final int hashCode() {
            Bitmap bitmap = this.f219177a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Bitmap bitmap2 = this.f219178b;
            int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
            Bitmap bitmap3 = this.f219179c;
            return iHashCode2 + (bitmap3 != null ? bitmap3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "LastSelectedPhotos(firstPhoto=" + this.f219177a + ", secondPhoto=" + this.f219178b + ", thirdPhoto=" + this.f219179c + ')';
        }

        public c(@l Bitmap bitmap, @l Bitmap bitmap2, @l Bitmap bitmap3) {
            this.f219177a = bitmap;
            this.f219178b = bitmap2;
            this.f219179c = bitmap3;
        }

        public /* synthetic */ c(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bitmap, (i12 & 2) != 0 ? null : bitmap2, (i12 & 4) != 0 ? null : bitmap3);
        }
    }

    static {
        a.b bVar = a.b.f219174a;
        Ratio ratio = Ratio.f219166c;
        f219144n = new CameraState(bVar, ratio, ratio, Flash.f219162d, CameraType.f219157b, true, "", new c(null, null, null, 7, null), false, false, true, true);
    }

    public CameraState(@k a aVar, @k Ratio ratio, @k Ratio ratio2, @k Flash flash, @k CameraType cameraType, boolean z12, @k String str, @k c cVar, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f219145a = aVar;
        this.f219146b = ratio;
        this.f219147c = ratio2;
        this.f219148d = flash;
        this.f219149e = cameraType;
        this.f219150f = z12;
        this.f219151g = str;
        this.f219152h = cVar;
        this.f219153i = z13;
        this.f219154j = z14;
        this.f219155k = z15;
        this.f219156l = z16;
    }

    public static CameraState a(CameraState cameraState, a aVar, Ratio ratio, Ratio ratio2, Flash flash, CameraType cameraType, boolean z12, String str, c cVar, boolean z13, int i12) {
        a aVar2 = (i12 & 1) != 0 ? cameraState.f219145a : aVar;
        Ratio ratio3 = (i12 & 2) != 0 ? cameraState.f219146b : ratio;
        Ratio ratio4 = (i12 & 4) != 0 ? cameraState.f219147c : ratio2;
        Flash flash2 = (i12 & 8) != 0 ? cameraState.f219148d : flash;
        CameraType cameraType2 = (i12 & 16) != 0 ? cameraState.f219149e : cameraType;
        boolean z14 = (i12 & 32) != 0 ? cameraState.f219150f : z12;
        String str2 = (i12 & 64) != 0 ? cameraState.f219151g : str;
        c cVar2 = (i12 & 128) != 0 ? cameraState.f219152h : cVar;
        boolean z15 = (i12 & 256) != 0 ? cameraState.f219153i : z13;
        boolean z16 = (i12 & 512) != 0 ? cameraState.f219154j : true;
        boolean z17 = (i12 & 1024) != 0 ? cameraState.f219155k : false;
        boolean z18 = (i12 & 2048) != 0 ? cameraState.f219156l : false;
        cameraState.getClass();
        return new CameraState(aVar2, ratio3, ratio4, flash2, cameraType2, z14, str2, cVar2, z15, z16, z17, z18);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return L.f(this.f219145a, cameraState.f219145a) && this.f219146b == cameraState.f219146b && this.f219147c == cameraState.f219147c && this.f219148d == cameraState.f219148d && this.f219149e == cameraState.f219149e && this.f219150f == cameraState.f219150f && L.f(this.f219151g, cameraState.f219151g) && L.f(this.f219152h, cameraState.f219152h) && this.f219153i == cameraState.f219153i && this.f219154j == cameraState.f219154j && this.f219155k == cameraState.f219155k && this.f219156l == cameraState.f219156l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219156l) + r.i(r.i(r.i((this.f219152h.hashCode() + H.d(r.i((this.f219149e.hashCode() + ((this.f219148d.hashCode() + ((this.f219147c.hashCode() + ((this.f219146b.hashCode() + (this.f219145a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f219150f), 31, this.f219151g)) * 31, 31, this.f219153i), 31, this.f219154j), 31, this.f219155k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraState(cameraInitializeState=");
        sb2.append(this.f219145a);
        sb2.append(", iconRatio=");
        sb2.append(this.f219146b);
        sb2.append(", cameraRatio=");
        sb2.append(this.f219147c);
        sb2.append(", flash=");
        sb2.append(this.f219148d);
        sb2.append(", cameraType=");
        sb2.append(this.f219149e);
        sb2.append(", isTakePhotoEnabled=");
        sb2.append(this.f219150f);
        sb2.append(", limits=");
        sb2.append(this.f219151g);
        sb2.append(", selectedPhotos=");
        sb2.append(this.f219152h);
        sb2.append(", isLandscape=");
        sb2.append(this.f219153i);
        sb2.append(", isDoneButtonLoading=");
        sb2.append(this.f219154j);
        sb2.append(", isDoneButtonEnabled=");
        sb2.append(this.f219155k);
        sb2.append(", isHintVisible=");
        return r.x(sb2, this.f219156l, ')');
    }
}
