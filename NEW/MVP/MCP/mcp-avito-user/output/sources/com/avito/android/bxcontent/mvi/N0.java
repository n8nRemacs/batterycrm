package com.avito.android.bxcontent.mvi;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.bxcontent.C29253t0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BxContentSavedSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class N0 extends kotlin.jvm.internal.N implements Y41.l<Map<String, ? extends String>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P0 f111414l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(P0 p02) {
        super(1);
        this.f111414l = p02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Map<String, ? extends String> map) throws Resources.NotFoundException {
        Map<String, ? extends String> map2 = map;
        P0 p02 = this.f111414l;
        C29253t0 c29253t0 = p02.f111438i;
        if (c29253t0 != null) {
            String string = (String) C42745f0.F(map2.values());
            if (string == null) {
                string = p02.f111434e.getString(R.string.saved_search_common_error);
            }
            c29253t0.N(string);
        }
        return kotlin.G0.f406611a;
    }
}
