package hZ;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.d0;
import com.avito.android.messenger_icebreakers_dialog.config.MessengerIcebreakerDialogTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;

/* compiled from: MessengerIcebreakerDialogAbTestProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhZ/b;", "LhZ/a;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40896b implements InterfaceC40895a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.messenger_icebreakers_dialog.features.a f397220a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f397221b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d0 f397222c;

    @Inject
    public C40896b(@k com.avito.android.messenger_icebreakers_dialog.features.a aVar, @k InterfaceC27642e interfaceC27642e, @k d0 d0Var) {
        this.f397220a = aVar;
        this.f397221b = interfaceC27642e;
        this.f397222c = d0Var;
    }

    @Override // hZ.InterfaceC40895a
    @k
    public final l<MessengerIcebreakerDialogTestGroup> a() {
        return new l<>(this.f397221b.c(new C40899e(this.f397220a)), this.f397222c);
    }
}
