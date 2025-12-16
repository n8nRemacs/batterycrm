package Ei0;

import Y61.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthStatusReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LEi0/a;", "Landroid/content/BroadcastReceiver;", "a", "b", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ei0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13491a extends BroadcastReceiver {

    /* compiled from: AuthStatusReceiver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEi0/a$a;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ei0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0250a {
    }

    /* compiled from: AuthStatusReceiver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEi0/a$b;", "", "<init>", "()V", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ei0.a$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@k Context context, @k Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("com.avito.android.ACTION_LOGIN_SUCCESS")) {
            throw null;
        }
        if (action.equals("com.avito.android.ACTION_LOGIN_FAILURE")) {
            throw null;
        }
        if (action.equals("com.avito.android.ACTION_LOGOUT_SUCCESS")) {
            intent.getBooleanExtra("is_user_action", false);
            throw null;
        }
        if (action.equals("com.avito.android.ACTION_LOGOUT_FAILURE")) {
            throw null;
        }
    }
}
