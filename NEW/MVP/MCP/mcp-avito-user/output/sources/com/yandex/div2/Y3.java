package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackground.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/Y3;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Y3 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f374043c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C38374i f374044d = new C38374i(null, null, null, null, 15, null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Uri> f374045a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C38374i f374046b;

    /* compiled from: DivNinePatchBackground.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Y3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Y3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Y3> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374047l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Y3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            Y3.f374043c.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivNinePatchBackground.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/Y3$b;", "", "<init>", "()V", "Lcom/yandex/div2/i;", "INSETS_DEFAULT_VALUE", "Lcom/yandex/div2/i;", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static Y3 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject, "image_url", com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, f370579a, com.yandex.div.internal.parser.E.f370135e);
            C38374i.f375287e.getClass();
            C38374i c38374i = (C38374i) C38107c.g(jSONObject, "insets", C38374i.f375296n, f370579a, eVar);
            if (c38374i == null) {
                c38374i = Y3.f374044d;
            }
            return new Y3(bVarC, c38374i);
        }

        public b() {
        }
    }

    static {
        int i12 = a.f374047l;
    }

    @C21.b
    public Y3(@Y61.k com.yandex.div.json.expressions.b<Uri> bVar, @Y61.k C38374i c38374i) {
        this.f374045a = bVar;
        this.f374046b = c38374i;
    }

    public /* synthetic */ Y3(com.yandex.div.json.expressions.b bVar, C38374i c38374i, int i12, C42822w c42822w) {
        this(bVar, (i12 & 2) != 0 ? f374044d : c38374i);
    }
}
