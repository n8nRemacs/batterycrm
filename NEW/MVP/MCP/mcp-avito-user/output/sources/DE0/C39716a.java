package de0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.publish.EditAdvertResult;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditAdvertDataSource.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lde0/a;", "Lde0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: de0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39716a implements InterfaceC39718c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f393986a;

    @Inject
    public C39716a(@k H0 h02) {
        this.f393986a = h02;
    }

    @Override // de0.InterfaceC39718c
    @k
    public final I<TypedResult<EditAdvertResult>> a(@k String str, @k String str2, @k Map<String, String> map, @l String str3, @k Map<String, String> map2, @k String str4, @l String str5) {
        return this.f393986a.K(str, str2, map, str3, map2, str4, str5);
    }
}
