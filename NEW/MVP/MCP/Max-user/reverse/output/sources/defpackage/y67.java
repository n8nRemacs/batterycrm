package defpackage;

import android.net.TrafficStats;
import java.net.URL;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class y67 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ y67(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                TrafficStats.setThreadStatsTag(str.hashCode());
                try {
                    return new URL(str).openStream();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            case 1:
                return str;
            default:
                yy7[] yy7VarArr = ShareDataPickerScreen.I0;
                return new qmb(null, 2, null, null, null, str != null ? ori.a(new imb("link_source", str)) : null, 29);
        }
    }
}
