package ru.avito.messenger.internal.gson.adapter;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.i;
import com.google.gson.j;
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
import ru.avito.messenger.api.entity.body.CallReference;
import ru.avito.messenger.api.entity.body.ImageReference;
import ru.avito.messenger.api.entity.body.ItemReference;
import ru.avito.messenger.api.entity.body.MessageBody;
import ru.avito.messenger.api.entity.body.MsgSystem;
import ru.avito.messenger.api.entity.body.Text;
import ru.avito.messenger.api.entity.body.Unknown;
import ru.avito.messenger.internal.util.KeyRuntimeTypeAdapter;

/* compiled from: MessageBodyTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/MessageBodyTypeAdapter;", "Lru/avito/messenger/internal/util/KeyRuntimeTypeAdapter;", "Lru/avito/messenger/api/entity/body/MessageBody;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageBodyTypeAdapter extends KeyRuntimeTypeAdapter<MessageBody> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap f431702g;

    /* compiled from: MessageBodyTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll91/c;", "typeId", "Lcom/google/gson/k;", "body", "Lru/avito/messenger/api/entity/body/MessageBody;", "invoke", "(Ll91/c;Lcom/google/gson/k;)Lru/avito/messenger/api/entity/body/MessageBody;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<C43607c, com.google.gson.k, MessageBody> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f431703l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final MessageBody invoke(C43607c c43607c, com.google.gson.k kVar) {
            C43607c c43607c2 = c43607c;
            i iVarD = kVar.D(com.avito.android.remote.model.messenger.message.MessageBody.RANDOM_ID);
            return new Unknown(c43607c2.f413572a, (iVarD == null || (iVarD instanceof j)) ? null : iVarD.s());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageBodyTypeAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // ru.avito.messenger.internal.util.RuntimeTypeAdapter
    @k
    public final Map<C43607c, Type> b() {
        return this.f431702g;
    }

    public /* synthetic */ MessageBodyTypeAdapter(Map map, InterfaceC43936c interfaceC43936c, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? P0.c() : map, (i12 & 2) != 0 ? null : interfaceC43936c);
    }

    public MessageBodyTypeAdapter(@k Map<C43607c, ? extends Type> map, @l InterfaceC43936c interfaceC43936c) {
        super(null, "body", a.f431703l, interfaceC43936c, 1, null);
        this.f431702g = P0.k(P0.g(new Q(new C43607c("text", null, 2, null), Text.class), new Q(new C43607c("item", null, 2, null), ItemReference.class), new Q(new C43607c(ChannelContext.System.TYPE, null, 2, null), MsgSystem.class), new Q(new C43607c("image", null, 2, null), ImageReference.class), new Q(new C43607c("call", null, 2, null), CallReference.class)), map);
    }
}
