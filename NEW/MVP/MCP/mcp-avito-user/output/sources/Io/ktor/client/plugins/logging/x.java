package io.ktor.client.plugins.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: LoggerJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/logging/x;", "Lio/ktor/client/plugins/logging/f;", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x implements f {

    /* renamed from: b, reason: collision with root package name */
    public final int f399563b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399564c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f399565d;

    public x() {
        this(0, 0, null, 7, null);
    }

    @Override // io.ktor.client.plugins.logging.f
    public final void log(@Y61.k String str) {
        while (true) {
            int length = str.length();
            f fVar = this.f399565d;
            int i12 = this.f399563b;
            if (length <= i12) {
                fVar.log(str);
                return;
            }
            String strSubstring = str.substring(0, i12);
            int iM2 = C43066x.M('\n', 0, 6, strSubstring);
            if (iM2 >= this.f399564c) {
                strSubstring = strSubstring.substring(0, iM2);
                i12 = iM2 + 1;
            }
            fVar.log(strSubstring);
            str = str.substring(i12);
        }
    }

    public x(int i12, int i13, f fVar, int i14, C42822w c42822w) {
        i12 = (i14 & 1) != 0 ? 4000 : i12;
        i13 = (i14 & 2) != 0 ? 3000 : i13;
        fVar = (i14 & 4) != 0 ? new g() : fVar;
        this.f399563b = i12;
        this.f399564c = i13;
        this.f399565d = fVar;
    }
}
