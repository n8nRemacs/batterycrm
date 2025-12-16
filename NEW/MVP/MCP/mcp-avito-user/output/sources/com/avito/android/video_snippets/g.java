package com.avito.android.video_snippets;

import Y61.k;
import Y61.l;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoSnippetsQueueController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_snippets/g;", "", "a", "c", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g {

    /* compiled from: VideoSnippetsQueueController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_snippets/g$a;", "", "<init>", "()V", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: VideoSnippetsQueueController.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void a(@k String str);

    void b(@k String str, boolean z12, @k SimpleDraweeView simpleDraweeView, @l l41.g<com.avito.android.video_snippets.b> gVar);

    void c(@k String str);

    @l
    Map.Entry<String, c> d();

    void e(@k HashMap map, @k String str, @l View view);

    @k
    LinkedHashMap f();

    void g();

    void h(boolean z12);

    /* compiled from: VideoSnippetsQueueController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_snippets/g$c;", "", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f326087a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326088b;

        /* renamed from: c, reason: collision with root package name */
        public final int f326089c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final StyledPlayerView f326090d;

        /* renamed from: e, reason: collision with root package name */
        public final float f326091e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Long f326092f;

        /* renamed from: g, reason: collision with root package name */
        public final float f326093g;

        /* renamed from: h, reason: collision with root package name */
        public final int f326094h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final SimpleDraweeView f326095i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final y.a f326096j;

        public c(@l String str, @k String str2, int i12, @k StyledPlayerView styledPlayerView, float f12, @l Long l12, float f13, int i13, @l SimpleDraweeView simpleDraweeView, @l y.a aVar) {
            this.f326087a = str;
            this.f326088b = str2;
            this.f326089c = i12;
            this.f326090d = styledPlayerView;
            this.f326091e = f12;
            this.f326092f = l12;
            this.f326093g = f13;
            this.f326094h = i13;
            this.f326095i = simpleDraweeView;
            this.f326096j = aVar;
        }

        public static c a(c cVar, int i12) {
            return new c(cVar.f326087a, cVar.f326088b, i12, cVar.f326090d, cVar.f326091e, cVar.f326092f, cVar.f326093g, cVar.f326094h, cVar.f326095i, cVar.f326096j);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (L.f(this.f326088b, cVar.f326088b) && this.f326089c == cVar.f326089c && L.f(this.f326090d, cVar.f326090d) && L.f(this.f326095i, cVar.f326095i) && L.f(this.f326096j, cVar.f326096j)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f326090d.hashCode() + (((this.f326088b.hashCode() * 31) + this.f326089c) * 31);
        }

        @k
        public final String toString() {
            return "VideoSnippetItem(itemId=" + this.f326087a + ", videoUrl=" + this.f326088b + ", position=" + this.f326089c + ", playerView=" + this.f326090d + ", galleryVisibilityPercentage=" + this.f326091e + ", videoPositionMs=" + this.f326092f + ", videoVolume=" + this.f326093g + ", videoRepeatMode=" + this.f326094h + ", thumbnail=" + this.f326095i + ", mediaSourceFactory=" + this.f326096j + ')';
        }

        public /* synthetic */ c(String str, String str2, int i12, StyledPlayerView styledPlayerView, float f12, Long l12, float f13, int i13, SimpleDraweeView simpleDraweeView, y.a aVar, int i14, C42822w c42822w) {
            this(str, str2, i12, styledPlayerView, f12, (i14 & 32) != 0 ? 0L : l12, (i14 & 64) != 0 ? 0.0f : f13, (i14 & 128) != 0 ? 0 : i13, (i14 & 256) != 0 ? null : simpleDraweeView, (i14 & 512) != 0 ? null : aVar);
        }
    }
}
