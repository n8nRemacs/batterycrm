package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.user_contacts.InfoElement;
import com.avito.android.remote.model.user_contacts.UserContactElement;
import com.avito.android.remote.model.user_contacts.UserContactResultElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: UserContactResultElementAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/UserContactResultElementAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/user_contacts/UserContactResultElement;", "<init>", "()V", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserContactResultElementAdapter extends RuntimeTypeAdapter<UserContactResultElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254258a;

    public UserContactResultElementAdapter() {
        super(null, null, null, 7, null);
        this.f254258a = P0.g(new kotlin.Q(RequestReviewResultKt.INFO_TYPE, InfoElement.class), new kotlin.Q("contact", UserContactElement.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.user_contacts.UserContactResultElement>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends UserContactResultElement>> getMapping() {
        return this.f254258a;
    }
}
