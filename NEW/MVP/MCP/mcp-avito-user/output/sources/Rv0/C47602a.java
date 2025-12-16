package rV0;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.d;
import kotlin.Metadata;

/* compiled from: PersistentRepositoryGetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LrV0/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d;", "a", "persistent_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rV0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47602a extends com.avito.beduin.v2.interaction.repository.flow.d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f429843d;

    /* compiled from: PersistentRepositoryGetInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrV0/a$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d$a;", "<init>", "()V", "persistent_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rV0.a$a, reason: collision with other inner class name */
    public static final class C12377a extends d.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12377a f429844b = new C12377a();

        public C12377a() {
            super("Persistent", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.d.a
        @k
        public final com.avito.beduin.v2.interaction.repository.flow.d c(@k z zVar, @k m mVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) throws BeduinPropertyException {
            String strL = mVar.l(zVar, "key");
            mVar.p(zVar, "value");
            return new C47602a(strL, lVar, lVar2, aVar);
        }
    }

    public C47602a(@k String str, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) {
        super(aVar, lVar, lVar2);
        this.f429843d = str;
    }
}
