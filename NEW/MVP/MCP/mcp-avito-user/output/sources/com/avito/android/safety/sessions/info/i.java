package com.avito.android.safety.sessions.info;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsInfoPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/info/i;", "Lcom/avito/android/safety/sessions/info/h;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SessionsInfoLink.SessionsInfoParams f257969a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f257970b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f257971c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f257972d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public SessionsInfoFragment f257973e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f257974f = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SessionsInfoPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SessionsInfoLink.SessionsInfoMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SessionsInfoLink.SessionsInfoMode sessionsInfoMode = SessionsInfoLink.SessionsInfoMode.f133964b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public i(@Y61.k SessionsInfoLink.SessionsInfoParams sessionsInfoParams, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k b bVar, @Y61.k E e12) {
        this.f257969a = sessionsInfoParams;
        this.f257970b = aVar;
        this.f257971c = bVar;
        this.f257972d = e12;
    }

    @Override // com.avito.android.safety.sessions.info.h
    public final void a(@Y61.k o oVar) {
        io.reactivex.rxjava3.disposables.d dVarT0 = oVar.f257988g.t0(new j(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f257974f;
        cVar.b(dVarT0);
        cVar.b(oVar.f257989h.t0(new k(this)));
        cVar.b(oVar.f257990i.t0(new l(this)));
        boolean zC2 = this.f257972d.c();
        int iOrdinal = this.f257969a.f133968b.ordinal();
        TextView textView = oVar.f257983b;
        Context context = oVar.f257982a;
        b bVar = this.f257971c;
        if (iOrdinal == 0) {
            if (zC2) {
                textView.setText(context.getString(R.string.sessions_result_logout_title_multiprofile));
                oVar.a(bVar.a());
                return;
            } else {
                textView.setText(context.getString(R.string.sessions_result_logout_title));
                oVar.a(bVar.d());
                return;
            }
        }
        if (iOrdinal != 1) {
            return;
        }
        if (zC2) {
            textView.setText(context.getString(R.string.sessions_result_password_change_title_multiprofile));
            oVar.a(bVar.c());
        } else {
            textView.setText(context.getString(R.string.sessions_result_password_change_title));
            oVar.a(bVar.b());
        }
    }

    @Override // com.avito.android.safety.sessions.info.h
    public final void b(@Y61.k SessionsInfoFragment sessionsInfoFragment) {
        this.f257973e = sessionsInfoFragment;
    }

    @Override // com.avito.android.safety.sessions.info.h
    public final void c0() {
        this.f257973e = null;
    }

    @Override // com.avito.android.safety.sessions.info.h
    public final void e0() {
        this.f257974f.e();
    }
}
