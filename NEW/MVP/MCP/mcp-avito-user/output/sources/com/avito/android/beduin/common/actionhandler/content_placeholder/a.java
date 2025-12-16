package com.avito.android.beduin.common.actionhandler.content_placeholder;

import Ui.InterfaceC15523b;
import Y61.k;
import androidx.view.C23038g0;
import com.avito.android.beduin.common.action.BeduinContentPlaceholderAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinHideContentPlaceholderHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/content_placeholder/a;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Hide;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15523b<BeduinContentPlaceholderAction.Hide> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C23038g0<BeduinContentPlaceholderAction.Hide> f100198a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23038g0 f100199b;

    @Inject
    public a() {
        C23038g0<BeduinContentPlaceholderAction.Hide> c23038g0 = new C23038g0<>();
        this.f100198a = c23038g0;
        this.f100199b = c23038g0;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100198a.postValue((BeduinContentPlaceholderAction.Hide) beduinAction);
    }
}
