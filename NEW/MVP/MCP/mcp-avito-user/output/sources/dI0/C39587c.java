package dI0;

import Y61.k;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.f;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: PublishWaterUxFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdI0/c;", "LdI0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dI0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39587c implements InterfaceC39586b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f393778a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43617a f393779b;

    @Inject
    public C39587c(@k SK0.b bVar, @k C43617a c43617a) {
        this.f393778a = bVar;
        this.f393779b = c43617a;
    }

    @Override // dI0.InterfaceC39586b
    @k
    public final G a(@k String str) {
        return new G(new f(2, this, str));
    }
}
