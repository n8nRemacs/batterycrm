package com.avito.android.screens.bbip_private_v2.data;

import Y61.k;
import Y61.l;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import java.util.ArrayList;
import java.util.Map;
import jh.C42376A;
import jh.v;
import kotlin.Metadata;
import qp0.C47426a;

/* compiled from: BbipPrivateV2Mapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/data/a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: BbipPrivateV2Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.screens.bbip_private_v2.data.a$a, reason: collision with other inner class name */
    public static final class C7812a {
    }

    @k
    Map<String, String> a(@k Object obj);

    @k
    ArrayList b(@k C42376A c42376a);

    @k
    C47426a c(@k BbipPrivateV2State bbipPrivateV2State);

    @k
    qp0.b d(@k BbipPrivateV2State bbipPrivateV2State, @l Integer num);

    @k
    BbipPrivateV2State e(@k v vVar);
}
