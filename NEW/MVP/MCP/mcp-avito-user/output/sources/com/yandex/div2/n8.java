package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivVideoSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/n8;", "Lcom/yandex/div/json/b;", "b", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class n8 implements com.yandex.div.json.b {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f375869e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, n8> f375870f = a.f375875l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f375871a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<String> f375872b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final c f375873c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Uri> f375874d;

    /* compiled from: DivVideoSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/n8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/n8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, n8> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f375875l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            n8.f375869e.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject2, "bitrate", lVar, c38106b, f370579a, null, dVar);
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject2, "mime_type", C38107c.f370141c, C38107c.f370140b, f370579a, com.yandex.div.internal.parser.E.f370133c);
            c.f375876c.getClass();
            return new n8(bVarI, bVarC, (c) C38107c.g(jSONObject2, CommonCode.MapKey.HAS_RESOLUTION, c.f375879f, f370579a, eVar2), C38107c.c(jSONObject2, ContextActionHandler.Link.URL, com.yandex.div.internal.parser.y.f370148b, c38106b, f370579a, com.yandex.div.internal.parser.E.f370135e));
        }
    }

    /* compiled from: DivVideoSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/n8$b;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivVideoSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/n8$c;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c implements com.yandex.div.json.b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f375876c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final D7 f375877d = new D7(26);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final D7 f375878e = new D7(27);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, c> f375879f = a.f375882l;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Long> f375880a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Long> f375881b;

        /* compiled from: DivVideoSource.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/n8$c;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/n8$c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, c> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f375882l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final c invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                c.f375876c.getClass();
                com.yandex.div.json.i f370579a = eVar.getF370579a();
                Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
                D7 d72 = c.f375877d;
                E.d dVar = com.yandex.div.internal.parser.E.f370132b;
                return new c(C38107c.c(jSONObject2, "height", lVar, d72, f370579a, dVar), C38107c.c(jSONObject2, "width", lVar, c.f375878e, f370579a, dVar));
            }
        }

        /* compiled from: DivVideoSource.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/n8$c$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "HEIGHT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "HEIGHT_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "WIDTH_TEMPLATE_VALIDATOR", "WIDTH_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        @C21.b
        public c(@Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.k com.yandex.div.json.expressions.b<Long> bVar2) {
            this.f375880a = bVar;
            this.f375881b = bVar2;
        }
    }

    @C21.b
    public n8(@Y61.l com.yandex.div.json.expressions.b<Long> bVar, @Y61.k com.yandex.div.json.expressions.b<String> bVar2, @Y61.l c cVar, @Y61.k com.yandex.div.json.expressions.b<Uri> bVar3) {
        this.f375871a = bVar;
        this.f375872b = bVar2;
        this.f375873c = cVar;
        this.f375874d = bVar3;
    }

    public /* synthetic */ n8(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, c cVar, com.yandex.div.json.expressions.b bVar3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, bVar2, (i12 & 4) != 0 ? null : cVar, bVar3);
    }
}
