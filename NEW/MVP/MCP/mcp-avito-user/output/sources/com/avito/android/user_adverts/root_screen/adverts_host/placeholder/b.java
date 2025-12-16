package com.avito.android.user_adverts.root_screen.adverts_host.placeholder;

import com.avito.android.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsPlaceholderView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWU/a;", "invoke", "()LWU/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.a<WU.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsPlaceholderView f313783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UserAdvertsPlaceholderView userAdvertsPlaceholderView) {
        super(0);
        this.f313783l = userAdvertsPlaceholderView;
    }

    @Override // Y41.a
    public final WU.a invoke() {
        return WU.a.a(this.f313783l.getAdvertsUnknownErrorState(), com.avito.android.printable_text.b.c(R.string.user_adverts_error_screen_title, new Serializable[0]), null, 29);
    }
}
