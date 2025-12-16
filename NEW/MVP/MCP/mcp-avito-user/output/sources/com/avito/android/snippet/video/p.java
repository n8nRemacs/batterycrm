package com.avito.android.snippet.video;

import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SnippetVideoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/snippet/video/p;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "a", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class p implements b.InterfaceC10495b {

    /* renamed from: b, reason: collision with root package name */
    public final long f284029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final a f284030c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f284031d;

    /* compiled from: SnippetVideoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/snippet/video/p$a;", "", "a", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C8471a f284032c = new C8471a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f284033a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.image_loader.a f284034b;

        /* compiled from: SnippetVideoState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/snippet/video/p$a$a;", "", "<init>", "()V", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.snippet.video.p$a$a, reason: collision with other inner class name */
        public static final class C8471a {
            public /* synthetic */ C8471a(C42822w c42822w) {
                this();
            }

            public C8471a() {
            }
        }

        public a(@Y61.k com.avito.android.image_loader.a aVar, @Y61.k String str) {
            this.f284033a = str;
            this.f284034b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f284033a.equals(aVar.f284033a) && this.f284034b.equals(aVar.f284034b);
        }

        public final int hashCode() {
            return this.f284034b.hashCode() + (this.f284033a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Video(videoUrl=" + this.f284033a + ", thumbnail=" + this.f284034b + ')';
        }
    }

    public p(long j12, @Y61.l a aVar) {
        this.f284029b = j12;
        this.f284030c = aVar;
        this.f284031d = String.valueOf(j12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f284029b == pVar.f284029b && L.f(this.f284030c, pVar.f284030c);
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272694i() {
        return this.f284029b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f284029b) * 31;
        a aVar = this.f284030c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "SnippetVideoState(trackId=" + this.f284029b + ", video=" + this.f284030c + ')';
    }
}
