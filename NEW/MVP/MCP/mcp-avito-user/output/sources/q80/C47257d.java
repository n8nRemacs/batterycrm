package q80;

import Y61.k;
import android.content.ContentResolver;
import com.avito.android.permissions.x;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryPickerRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq80/d;", "Lq80/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q80.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47257d implements InterfaceC47255b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContentResolver f429052a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f429053b;

    @Inject
    public C47257d(@k ContentResolver contentResolver, @k x xVar) {
        this.f429052a = contentResolver;
        this.f429053b = xVar;
    }

    @Override // q80.InterfaceC47255b
    @k
    public final C42006d O() {
        return new C42006d(new com.my.target.ads.a(this, 21));
    }
}
