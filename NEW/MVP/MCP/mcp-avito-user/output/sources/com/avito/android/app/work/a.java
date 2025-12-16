package com.avito.android.app.work;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23034e0;
import androidx.view.Lifecycle;
import androidx.work.L;
import com.avito.android.favorite_sellers.adapter.recommendation.B;
import com.avito.android.location.find.u;
import com.avito.android.messenger.conversation.mvi.file_download.C32053q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_favorites.K;
import com.avito.android.util.C35969w4;
import com.google.android.gms.location.InterfaceC36781b;
import io.reactivex.rxjava3.core.H;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements l41.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91758c;

    public /* synthetic */ a(int i12, Object obj, Object obj2) {
        this.f91756a = i12;
        this.f91757b = obj;
        this.f91758c = obj2;
    }

    @Override // l41.f
    public final void cancel() {
        switch (this.f91756a) {
            case 0:
                ((L) this.f91757b).a().cancel(false);
                ((H.c) this.f91758c).dispose();
                break;
            case 1:
                ((B) this.f91757b).f155584c.v0((B.b) this.f91758c);
                break;
            case 2:
                u uVar = (u) this.f91757b;
                InterfaceC36781b interfaceC36781b = uVar.f181773p;
                if (interfaceC36781b != null) {
                    interfaceC36781b.removeLocationUpdates((com.avito.android.location.find.B) this.f91758c);
                }
                uVar.f181772b = null;
                break;
            case 3:
                ((C23034e0) this.f91757b).removeObserver((C32053q) this.f91758c);
                break;
            case 4:
                AttributedText.linkClicksV3$lambda$2$lambda$1((AttributedText) this.f91757b, (com.avito.android.remote.model.text.b) this.f91758c);
                break;
            case 5:
                ((com.avito.android.user_favorites.L) this.f91757b).f316792d.n((K) this.f91758c);
                break;
            case 6:
                ((RecyclerView) this.f91757b).v0((C35969w4) this.f91758c);
                break;
            default:
                ((Lifecycle) this.f91757b).c((M11.d) this.f91758c);
                break;
        }
    }
}
