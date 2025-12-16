package com.avito.android.remote.safedeal;

import Y61.k;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import com.avito.android.remote.safedeal.SafeDeal;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SafeDealReturnCheckoutDialogTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDealReturnCheckoutDialogTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "<init>", "()V", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SafeDealReturnCheckoutDialogTypeAdapter extends RuntimeTypeAdapter<SafeDeal.ReturnCheckoutDialog> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f254361a;

    public SafeDealReturnCheckoutDialogTypeAdapter() {
        super(null, "content", SafeDeal.ReturnCheckoutDialog.Unknown.class, 1, null);
        this.f254361a = P0.g(new Q("favorite", SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog.class), new Q("chat", SafeDeal.ReturnCheckoutDialog.ChatDialog.class), new Q("default", SafeDeal.ReturnCheckoutDialog.DefaultDialog.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Type> getMapping() {
        return this.f254361a;
    }
}
