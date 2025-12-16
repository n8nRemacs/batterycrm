package com.avito.android.safedeal.universal_delivery_type.courier.select_location;

import Ju.AbstractC14250d;
import android.content.Intent;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.form.transforms.StringParametersTransform;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.deep_linking.links.UniversalDeliveryCourierLocationSelectLink;
import com.avito.android.safedeal.universal_delivery_type.courier.select_location.a;
import hj.AbstractC40946b;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;
import l41.o;
import lj.d;
import rv.C47918a;

/* compiled from: UniversalDeliveryCourierLocationSelectDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "LJu/c$b;", "apply", "(Lrv/a;)LJu/c$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UniversalDeliveryCourierLocationSelectLink f256563b;

    public c(a aVar, UniversalDeliveryCourierLocationSelectLink universalDeliveryCourierLocationSelectLink) {
        this.f256563b = universalDeliveryCourierLocationSelectLink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C47918a c47918a = (C47918a) obj;
        Intent intent = c47918a.f437157c;
        String stringExtra = intent != null ? intent.getStringExtra("extra_city") : null;
        String stringExtra2 = intent != null ? intent.getStringExtra("extra_address") : null;
        if (c47918a.f437156b != -1 || stringExtra == null || stringExtra2 == null) {
            return AbstractC14250d.b.f9170c;
        }
        if (!C43066x.K(stringExtra)) {
            stringExtra2 = r.r(stringExtra, ", ", stringExtra2);
        }
        UniversalDeliveryCourierLocationSelectLink universalDeliveryCourierLocationSelectLink = this.f256563b;
        String str = universalDeliveryCourierLocationSelectLink.f133746d;
        return new a.C7685a(new AbstractC40946b.c(new AbstractC40946b.c.a.C11271b(universalDeliveryCourierLocationSelectLink.f133747e), new d.e(Collections.singletonMap(str, C42745f0.U(new TextTransform(stringExtra2), new StringParametersTransform(Collections.singletonMap(str, stringExtra2)))))));
    }
}
