package com.avito.android.video_snippets;

import Y61.k;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoSnippetEvents.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/video_snippets/b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/video_snippets/b$a;", "Lcom/avito/android/video_snippets/b$b;", "Lcom/avito/android/video_snippets/b$c;", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class b {

    /* compiled from: VideoSnippetEvents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_snippets/b$a;", "Lcom/avito/android/video_snippets/b;", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f326062a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326063b;

        public a(@k String str, @k String str2) {
            super(null);
            this.f326062a = str;
            this.f326063b = str2;
        }
    }

    /* compiled from: VideoSnippetEvents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_snippets/b$b;", "Lcom/avito/android/video_snippets/b;", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.video_snippets.b$b, reason: collision with other inner class name */
    public static final class C10076b extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f326064a;

        public C10076b(@k String str) {
            super(null);
            this.f326064a = str;
        }
    }

    /* compiled from: VideoSnippetEvents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_snippets/b$c;", "Lcom/avito/android/video_snippets/b;", "_avito_video-snippets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f326065a;

        /* renamed from: b, reason: collision with root package name */
        public final double f326066b;

        /* renamed from: c, reason: collision with root package name */
        public final double f326067c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final VideoStopReason f326068d;

        public c(@k String str, double d12, double d13, @k VideoStopReason videoStopReason) {
            super(null);
            this.f326065a = str;
            this.f326066b = d12;
            this.f326067c = d13;
            this.f326068d = videoStopReason;
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
