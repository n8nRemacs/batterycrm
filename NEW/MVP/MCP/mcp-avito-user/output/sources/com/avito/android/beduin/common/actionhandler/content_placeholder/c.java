package com.avito.android.beduin.common.actionhandler.content_placeholder;

import Ui.InterfaceC15523b;
import Y61.k;
import androidx.view.C23038g0;
import com.avito.android.beduin.common.action.BeduinContentPlaceholderAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinShowContentPlaceholderHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/content_placeholder/c;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC15523b<BeduinContentPlaceholderAction.Show> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C23038g0<BeduinContentPlaceholderAction.Show> f100201a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23038g0 f100202b;

    @Inject
    public c() {
        C23038g0<BeduinContentPlaceholderAction.Show> c23038g0 = new C23038g0<>();
        this.f100201a = c23038g0;
        this.f100202b = c23038g0;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100201a.postValue((BeduinContentPlaceholderAction.Show) beduinAction);
    }
}
