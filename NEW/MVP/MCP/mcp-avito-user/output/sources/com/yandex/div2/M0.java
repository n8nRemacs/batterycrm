package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/M0;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class M0 implements com.yandex.div.json.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f372773b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C38502q1 f372774c = new C38502q1(null, com.google.firebase.components.g.i(15, com.yandex.div.json.expressions.b.f370552a), 1, null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C38502q1 f372775a;

    /* compiled from: DivDefaultIndicatorItemPlacement.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/M0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/M0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, M0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372776l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final M0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            M0.f372773b.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            C38502q1.f376146c.getClass();
            C38502q1 c38502q1 = (C38502q1) C38107c.g(jSONObject, "space_between_centers", C38502q1.f376150g, f370579a, eVar2);
            if (c38502q1 == null) {
                c38502q1 = M0.f372774c;
            }
            return new M0(c38502q1);
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacement.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/M0$b;", "", "<init>", "()V", "Lcom/yandex/div2/q1;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/q1;", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        int i12 = a.f372776l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public M0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @C21.b
    public M0(@Y61.k C38502q1 c38502q1) {
        this.f372775a = c38502q1;
    }

    public /* synthetic */ M0(C38502q1 c38502q1, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f372774c : c38502q1);
    }
}
