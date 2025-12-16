package com.avito.android.publish.details.tags;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.suggests.TitleSuggestsResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import l41.o;
import yc.C50213a;

/* compiled from: PublishTagsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/tags/b;", "Lcom/avito/android/publish/details/tags/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.details.tags.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f235014a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f235015b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C50213a f235016c;

    /* compiled from: PublishTagsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/publish/BubbleSuggest;", "it", "Lcom/avito/android/remote/model/suggests/TitleSuggestsResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f235017b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((TitleSuggestsResponse) obj).getList();
        }
    }

    @Inject
    public b(@k H0 h02, @k InterfaceC35745a5 interfaceC35745a5, @k C50213a c50213a) {
        this.f235014a = h02;
        this.f235015b = interfaceC35745a5;
        this.f235016c = c50213a;
    }

    @Override // com.avito.android.publish.details.tags.a
    @k
    public final I a(@l Integer num, @k String str) {
        if (str.length() == 0) {
            return I.q(C42784z0.f406748b);
        }
        return g1.a(this.f235014a.o(str, this.f235016c.b(), num).z(this.f235015b.a())).r(a.f235017b).u(new C32102w0(8));
    }
}
