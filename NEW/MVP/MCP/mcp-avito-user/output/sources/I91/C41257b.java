package i91;

import Y61.k;
import Y81.c;
import Y81.d;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.W;
import kotlin.Metadata;

/* compiled from: SimpleConfigProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li91/b;", "LY81/c;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C41257b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f398409a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f398410b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y81.a f398411c;

    public C41257b(@k d dVar, @k InterfaceC35745a5 interfaceC35745a5, @k Y81.a aVar) {
        this.f398409a = dVar;
        this.f398410b = interfaceC35745a5;
        this.f398411c = aVar;
    }

    @Override // Y81.c
    @k
    public final W getConfig() {
        G gA2 = this.f398409a.a(this.f398411c);
        InterfaceC35745a5 interfaceC35745a5 = this.f398410b;
        return gA2.s(interfaceC35745a5.c()).u(new androidx.room.rxjava3.b(this, 24)).z(interfaceC35745a5.a());
    }
}
