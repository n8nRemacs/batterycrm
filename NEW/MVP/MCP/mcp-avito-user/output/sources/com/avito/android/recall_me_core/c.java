package com.avito.android.recall_me_core;

import AK0.l;
import Hq0.C14020b;
import Y61.k;
import androidx.appcompat.app.r;
import com.avito.android.advert.deeplinks.delivery.p;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.S;
import javax.inject.Inject;
import kotlin.Metadata;
import wi0.InterfaceC49631b;

/* compiled from: RecallMeConfirmedInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me_core/c;", "Lcom/avito/android/recall_me_core/b;", "a", "_avito-discouraged_avito-libs_recall-me-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC49631b> f252042a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f252043b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f252044c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.a f252045d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Gson f252046e;

    /* compiled from: RecallMeConfirmedInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/recall_me_core/c$a;", "", "", "requestAfterTime", "", "recordingTime", "<init>", "(IJ)V", "I", "b", "()I", "J", "a", "()J", "_avito-discouraged_avito-libs_recall-me-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("recordingTime")
        private final long recordingTime;

        @com.google.gson.annotations.c("requestAfterTime")
        private final int requestAfterTime;

        public a(int i12, long j12) {
            this.requestAfterTime = i12;
            this.recordingTime = j12;
        }

        /* renamed from: a, reason: from getter */
        public final long getRecordingTime() {
            return this.recordingTime;
        }

        /* renamed from: b, reason: from getter */
        public final int getRequestAfterTime() {
            return this.requestAfterTime;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.requestAfterTime == aVar.requestAfterTime && this.recordingTime == aVar.recordingTime;
        }

        public final int hashCode() {
            return Long.hashCode(this.recordingTime) + (Integer.hashCode(this.requestAfterTime) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LastTimer(requestAfterTime=");
            sb2.append(this.requestAfterTime);
            sb2.append(", recordingTime=");
            return r.u(sb2, this.recordingTime, ')');
        }
    }

    @Inject
    public c(@k h31.e<InterfaceC49631b> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k l lVar, @k com.avito.android.server_time.a aVar, @k Gson gson) {
        this.f252042a = eVar;
        this.f252043b = interfaceC35745a5;
        this.f252044c = lVar;
        this.f252045d = aVar;
        this.f252046e = gson;
    }

    @Override // com.avito.android.recall_me_core.b
    @k
    public final C42026y a(@k String str, @k String str2) {
        return g1.a(new C42007e(new p(this, str, str2, 13)).z(this.f252043b.a()));
    }

    @Override // com.avito.android.recall_me_core.b
    @k
    public final S b(@k String str) {
        C42007e c42007e = new C42007e(new C14020b(16, this, str));
        InterfaceC35745a5 interfaceC35745a5 = this.f252043b;
        return g1.a(c42007e.z(interfaceC35745a5.a())).s(interfaceC35745a5.e()).r(new d(this, str)).h(new e(this, str)).s(interfaceC35745a5.a());
    }
}
