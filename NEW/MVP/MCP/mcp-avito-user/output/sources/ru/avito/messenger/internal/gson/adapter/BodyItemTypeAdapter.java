package ru.avito.messenger.internal.gson.adapter;

import Y41.p;
import Y61.k;
import Y61.l;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import l91.C43607c;
import m91.InterfaceC43936c;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import ru.avito.messenger.api.entity.body.item.Item;
import ru.avito.messenger.api.entity.body.item.Unknown;
import ru.avito.messenger.internal.util.KeyRuntimeTypeAdapter;

/* compiled from: BodyItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/BodyItemTypeAdapter;", "Lru/avito/messenger/internal/util/KeyRuntimeTypeAdapter;", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BodyItemTypeAdapter extends KeyRuntimeTypeAdapter<BodyItem> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap f431698g;

    /* compiled from: BodyItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll91/c;", "typeId", "Lcom/google/gson/k;", "<anonymous parameter 1>", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "invoke", "(Ll91/c;Lcom/google/gson/k;)Lru/avito/messenger/api/entity/body/item/BodyItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<C43607c, com.google.gson.k, BodyItem> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f431699l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final BodyItem invoke(C43607c c43607c, com.google.gson.k kVar) {
            C43607c c43607c2 = c43607c;
            return new Unknown(c43607c2.f413572a, c43607c2.f413573b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BodyItemTypeAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // ru.avito.messenger.internal.util.RuntimeTypeAdapter
    @k
    public final Map<C43607c, Type> b() {
        return this.f431698g;
    }

    public /* synthetic */ BodyItemTypeAdapter(Map map, InterfaceC43936c interfaceC43936c, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? P0.c() : map, (i12 & 2) != 0 ? null : interfaceC43936c);
    }

    public BodyItemTypeAdapter(@k Map<C43607c, ? extends Type> map, @l InterfaceC43936c interfaceC43936c) {
        super(null, null, a.f431699l, interfaceC43936c, 3, null);
        this.f431698g = P0.k(P0.g(new Q(new C43607c("item", null, 2, null), Item.class), new Q(new C43607c("cv", null, 2, null), Item.class), new Q(new C43607c("vacancy", null, 2, null), Item.class)), map);
    }
}
