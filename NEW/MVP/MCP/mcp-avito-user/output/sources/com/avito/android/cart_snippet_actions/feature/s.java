package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.R;
import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tn.InterfaceC48693b;
import tn.InterfaceC48694c;

/* compiled from: CartSnippetActionsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/s;", "Lcom/avito/android/arch/mvi/t;", "Ltn/b;", "Ltn/c;", "<init>", "()V", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements com.avito.android.arch.mvi.t<InterfaceC48693b, InterfaceC48694c> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48694c b(InterfaceC48693b interfaceC48693b) {
        InterfaceC48694c c12679c;
        InterfaceC48693b interfaceC48693b2 = interfaceC48693b;
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.UpdateItemsError) {
            ApiError apiError = ((TrueCartSnippetActionsInternalAction.UpdateItemsError) interfaceC48693b2).f116188b;
            String strI = z.i(apiError);
            return new InterfaceC48694c.b(apiError, strI != null ? com.avito.android.printable_text.b.f(strI) : com.avito.android.printable_text.b.c(R.string.update_cart_items_error, new Serializable[0]), null, true, 4, null);
        }
        if (interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.c) {
            ((TrueCartSnippetActionsInternalAction.c) interfaceC48693b2).getClass();
            c12679c = new InterfaceC48694c.a(null, null, null, 6, null);
        } else {
            if (!(interfaceC48693b2 instanceof TrueCartSnippetActionsInternalAction.k)) {
                return null;
            }
            c12679c = new InterfaceC48694c.C12679c(((TrueCartSnippetActionsInternalAction.k) interfaceC48693b2).f116202b);
        }
        return c12679c;
    }
}
