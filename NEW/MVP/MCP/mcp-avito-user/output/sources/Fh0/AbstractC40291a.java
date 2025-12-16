package fH0;

import Y61.k;
import com.jakewharton.rxrelay3.c;
import io.reactivex.rxjava3.disposables.d;
import j.InterfaceC42153i;
import kotlin.Metadata;

/* compiled from: BasePresenterDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfH0/a;", "Lio/reactivex/rxjava3/disposables/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fH0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC40291a implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c<InterfaceC40292b> f395801b = new c<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f395802c = new io.reactivex.rxjava3.disposables.c();

    @Override // io.reactivex.rxjava3.disposables.d
    @InterfaceC42153i
    public void dispose() {
        this.f395802c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f395802c.f401978c;
    }
}
