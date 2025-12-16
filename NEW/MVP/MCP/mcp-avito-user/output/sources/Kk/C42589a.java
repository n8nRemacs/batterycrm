package kK;

import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacBroadcastReceiver.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LkK/a;", "Landroid/content/BroadcastReceiver;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42589a extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C11613a f406229b = new C11613a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42591c f406230a;

    /* compiled from: IacBroadcastReceiver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"LkK/a$a;", "", "<init>", "()V", "", "ACTION_IAC_BROADCAST_ACTION", "Ljava/lang/String;", "EXTRA_CALL_ID", "EXTRA_TYPE", "TAG", "TYPE_CHANGE_AUDIO_DEVICE_FROM_OVERLAY", "TYPE_HANGUP_FROM_COMMON_NOTIFICATION", "TYPE_HANGUP_FROM_RESERVE_NOTIFICATION", "TYPE_REJECT_FROM_COMMON_NOTIFICATION", "TYPE_REJECT_FROM_RESERVE_NOTIFICATION", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kK.a$a, reason: collision with other inner class name */
    public static final class C11613a {
        public /* synthetic */ C11613a(C42822w c42822w) {
            this();
        }

        public C11613a() {
        }
    }

    public C42589a(@k C42591c c42591c) {
        this.f406230a = c42591c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        if (L.f(intent != null ? intent.getAction() : null, "IacBroadcastReceiver.ACTION_IAC_BROADCAST_ACTION")) {
            String stringExtra = intent.getStringExtra("IacBroadcastReceiver.EXTRA_TYPE");
            String stringExtra2 = intent.getStringExtra("IacBroadcastReceiver.EXTRA_CALL_ID");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacBroadcastReceiver", androidx.compose.ui.graphics.colorspace.e.n("broadcast received: ", stringExtra, ", callId=", stringExtra2), null);
            if (stringExtra != null) {
                int iHashCode = stringExtra.hashCode();
                C42591c c42591c = this.f406230a;
                switch (iHashCode) {
                    case -1651467763:
                        if (stringExtra.equals("IacBroadcastReceiver.TYPE_HANGUP_FROM_RESERVE_NOTIFICATION")) {
                            c42591c.f406235e.K5(stringExtra2);
                            break;
                        }
                        break;
                    case -805073368:
                        if (stringExtra.equals("IacBroadcastReceiver.TYPE_CHANGE_AUDIO_DEVICE_FROM_OVERLAY")) {
                            c42591c.f406236f.K5(G0.f406611a);
                            break;
                        }
                        break;
                    case -464158561:
                        if (stringExtra.equals("IacBroadcastReceiver.TYPE_REJECT_FROM_RESERVE_NOTIFICATION")) {
                            c42591c.f406233c.K5(G0.f406611a);
                            break;
                        }
                        break;
                    case 43266176:
                        if (stringExtra.equals("IacBroadcastReceiver.TYPE_HANGUP_FROM_COMMON_NOTIFICATION")) {
                            c42591c.f406234d.K5(stringExtra2);
                            break;
                        }
                        break;
                    case 1328492462:
                        if (stringExtra.equals("IacBroadcastReceiver.TYPE_REJECT_FROM_COMMON_NOTIFICATION")) {
                            c42591c.f406232b.K5(G0.f406611a);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
