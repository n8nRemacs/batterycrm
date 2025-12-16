package com.avito.android.dialog;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import io.reactivex.rxjava3.internal.operators.maybe.C41916j;
import io.reactivex.rxjava3.internal.operators.maybe.Y;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/dialog/a;", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.dialog.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30274a {

    /* compiled from: DialogPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.dialog.a$a, reason: collision with other inner class name */
    public static final class C4208a {
    }

    @InterfaceC42830m
    void a(@Y61.k String str, @Y61.k CharSequence charSequence, @Y61.l CharSequence charSequence2);

    @Y61.k
    C41916j b(@Y61.k CharSequence charSequence, @Y61.l String str, @Y61.l String str2, boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.q<DeepLink> c(@Y61.k Action action);

    @Y61.k
    C41916j d(@Y61.k CharSequence charSequence, @Y61.l String str);

    @Y61.k
    C41916j e(@Y61.l String str, @Y61.l CharSequence charSequence, @Y61.l String str2, @Y61.l String str3, boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.q f(@Y61.k UserDialog userDialog);

    @Y61.k
    Y g(@Y61.k UserDialog userDialog);
}
