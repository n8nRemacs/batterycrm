package com.avito.avcalls.logger;

import Y61.k;
import Y61.l;
import com.avito.avcalls.a;
import com.avito.avcalls.logger.AvCallsLogMessage;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: LogMessageSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/logger/f;", "Lcom/avito/avcalls/logger/b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f332955a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.f f332956b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC43129d1 f332957c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.avcalls.utils.coroutines.c f332958d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f332959e = f2.b(0, 0, null, 7);

    public f(@k a aVar, @k a.f fVar, @k AbstractC43129d1 abstractC43129d1, @k com.avito.avcalls.utils.coroutines.c cVar) {
        this.f332955a = aVar;
        this.f332956b = fVar;
        this.f332957c = abstractC43129d1;
        this.f332958d = cVar;
        C43259k.d(cVar, null, null, new c(this, null), 3);
    }

    public final void a(@k String str, @k LogSeverity logSeverity, @k String str2) {
        a aVar = this.f332955a;
        aVar.getClass();
        LogSeverity logSeverity2 = LogSeverity.f332936c;
        if (logSeverity.f332943b >= 1) {
            AvCallsLogMessage avCallsLogMessage = new AvCallsLogMessage(AvCallsLogMessage.Kind.f332933c, str, logSeverity, str2, null);
            if (!aVar.f332944a) {
                this.f332956b.g(avCallsLogMessage);
            } else {
                C43259k.d(this.f332958d, null, null, new e(this, avCallsLogMessage, null), 3);
            }
        }
    }

    public final void b(@k String str, @k LogSeverity logSeverity, @k String str2, @l Exception exc) {
        a aVar = this.f332955a;
        aVar.getClass();
        LogSeverity logSeverity2 = LogSeverity.f332936c;
        if (logSeverity.f332943b >= 0) {
            AvCallsLogMessage avCallsLogMessage = new AvCallsLogMessage(AvCallsLogMessage.Kind.f332932b, str, logSeverity, str2, exc);
            if (!aVar.f332944a) {
                this.f332956b.g(avCallsLogMessage);
            } else {
                C43259k.d(this.f332958d, null, null, new e(this, avCallsLogMessage, null), 3);
            }
        }
    }
}
