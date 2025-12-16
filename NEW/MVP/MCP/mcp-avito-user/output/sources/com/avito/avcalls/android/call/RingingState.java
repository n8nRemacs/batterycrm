package com.avito.avcalls.android.call;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IncomingCallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/call/RingingState;", "", "Progress", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class RingingState {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Progress f331462a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f331463b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IncomingCallSession.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/RingingState$Progress;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Progress {

        /* renamed from: b, reason: collision with root package name */
        public static final Progress f331464b;

        /* renamed from: c, reason: collision with root package name */
        public static final Progress f331465c;

        /* renamed from: d, reason: collision with root package name */
        public static final Progress f331466d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Progress[] f331467e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331468f;

        static {
            Progress progress = new Progress("NotSent", 0);
            f331464b = progress;
            Progress progress2 = new Progress("Sending", 1);
            f331465c = progress2;
            Progress progress3 = new Progress("Sent", 2);
            f331466d = progress3;
            Progress[] progressArr = {progress, progress2, progress3};
            f331467e = progressArr;
            f331468f = kotlin.enums.c.a(progressArr);
        }

        public Progress() {
            throw null;
        }

        public static Progress valueOf(String str) {
            return (Progress) Enum.valueOf(Progress.class, str);
        }

        public static Progress[] values() {
            return (Progress[]) f331467e.clone();
        }
    }

    public RingingState() {
        this(null, false, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RingingState)) {
            return false;
        }
        RingingState ringingState = (RingingState) obj;
        return this.f331462a == ringingState.f331462a && this.f331463b == ringingState.f331463b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f331463b) + (this.f331462a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RingingState(progress=");
        sb2.append(this.f331462a);
        sb2.append(", shouldAcceptAfterSending=");
        return androidx.appcompat.app.r.x(sb2, this.f331463b, ')');
    }

    public RingingState(Progress progress, boolean z12, int i12, C42822w c42822w) {
        progress = (i12 & 1) != 0 ? Progress.f331464b : progress;
        z12 = (i12 & 2) != 0 ? false : z12;
        this.f331462a = progress;
        this.f331463b = z12;
    }
}
