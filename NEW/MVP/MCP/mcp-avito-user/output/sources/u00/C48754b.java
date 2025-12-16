package u00;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: ItemScrollStateProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu00/b;", "Lu00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u00.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48754b implements InterfaceC48753a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Kundle f439721a;

    @Override // u00.InterfaceC48753a
    @l
    public final Parcelable a(@k String str) {
        return this.f439721a.d(str);
    }

    @Override // u00.InterfaceC48753a
    public final void b(@k Parcelable parcelable, @k String str) {
        this.f439721a.j(parcelable, str);
    }

    @Override // u00.InterfaceC48753a
    @k
    /* renamed from: c, reason: from getter */
    public final Kundle getF439721a() {
        return this.f439721a;
    }
}
