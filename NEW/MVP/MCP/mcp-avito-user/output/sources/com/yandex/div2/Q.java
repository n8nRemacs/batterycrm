package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivChangeSetTransition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/Q;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Q implements com.yandex.div.json.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f373455b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C38491p f373456c = new C38491p(12);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<T> f373457a;

    /* compiled from: DivChangeSetTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Q;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Q;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Q> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373458l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Q invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            Q.f373455b.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            T.f373510a.getClass();
            return new Q(C38107c.f(jSONObject2, "items", T.f373511b, Q.f373456c, f370579a, eVar2));
        }
    }

    /* compiled from: DivChangeSetTransition.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/Q$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/T;", "ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        int i12 = a.f373458l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public Q(@Y61.k List<? extends T> list) {
        this.f373457a = list;
    }
}
