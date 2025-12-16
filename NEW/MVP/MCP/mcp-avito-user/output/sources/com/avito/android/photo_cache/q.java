package com.avito.android.photo_cache;

import androidx.appcompat.app.r;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ImageUpload;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UploadingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/photo_cache/q;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/photo_cache/q$a;", "Lcom/avito/android/photo_cache/q$c;", "Lcom/avito/android/photo_cache/q$d;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class q {

    /* compiled from: UploadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/q$a;", "Lcom/avito/android/photo_cache/q;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f216337a;

        public a(@Y61.k ApiError apiError) {
            super(null);
            this.f216337a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return L.f(obj != null ? obj.getClass() : null, a.class) && L.f(this.f216337a, ((a) obj).f216337a);
        }

        public final int hashCode() {
            return this.f216337a.hashCode();
        }
    }

    /* compiled from: UploadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/q$b;", "", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        List<ImageUpload> getData();
    }

    /* compiled from: UploadingState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_cache/q$c;", "Lcom/avito/android/photo_cache/q;", "Lcom/avito/android/photo_cache/q$b;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f216338a;

        public c(@Y61.k ArrayList arrayList) {
            super(null);
            this.f216338a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f216338a, ((c) obj).f216338a);
        }

        @Override // com.avito.android.photo_cache.q.b
        @Y61.k
        public final List<ImageUpload> getData() {
            return this.f216338a;
        }

        public final int hashCode() {
            return this.f216338a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Loaded(data="), this.f216338a, ')');
        }
    }

    /* compiled from: UploadingState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_cache/q$d;", "Lcom/avito/android/photo_cache/q;", "Lcom/avito/android/photo_cache/q$b;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<ImageUpload> f216339a;

        /* renamed from: b, reason: collision with root package name */
        public final int f216340b;

        /* renamed from: c, reason: collision with root package name */
        public final int f216341c;

        public /* synthetic */ d(List list, int i12, int i13, int i14, C42822w c42822w) {
            this((i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, list);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f216339a, dVar.f216339a) && this.f216340b == dVar.f216340b && this.f216341c == dVar.f216341c;
        }

        @Override // com.avito.android.photo_cache.q.b
        @Y61.k
        public final List<ImageUpload> getData() {
            return this.f216339a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f216341c) + r.e(this.f216340b, this.f216339a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loading(data=");
            sb2.append(this.f216339a);
            sb2.append(", progressCurrent=");
            sb2.append(this.f216340b);
            sb2.append(", progressMax=");
            return r.t(sb2, this.f216341c, ')');
        }

        public d(int i12, int i13, @Y61.k List list) {
            super(null);
            this.f216339a = list;
            this.f216340b = i12;
            this.f216341c = i13;
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    public q() {
    }
}
