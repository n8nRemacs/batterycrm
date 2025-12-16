package Lg0;

import Mg0.InterfaceC14487a;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingPublishInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLg0/b;", "LLg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14395b implements InterfaceC14394a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14487a f10081a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f10082b;

    @Inject
    public C14395b(@k InterfaceC14487a interfaceC14487a, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f10081a = interfaceC14487a;
        this.f10082b = interfaceC35745a5;
    }

    @Override // Lg0.InterfaceC14394a
    @k
    public final W a(@k String str) {
        return Y5.a(this.f10081a.s(str)).S().z(this.f10082b.a());
    }
}
