package com.avito.android.beduin.common.component.file_uploader.data;

import android.content.ContentResolver;
import com.avito.android.beduin.common.component.file_uploader.ApiConfiguration;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.UnauthorizedException;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.P;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.O;
import io.reactivex.rxjava3.internal.operators.single.V;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.MultipartBody;
import zZ.C50528b;

/* compiled from: FileUploaderInteractor.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/data/g;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f101246d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f101247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f101248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f101249c;

    /* compiled from: FileUploaderInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/data/g$a;", "", "<init>", "()V", "", "THROTTLE_DURATION_SM", "J", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k b bVar, @Y61.k ContentResolver contentResolver, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f101247a = bVar;
        this.f101248b = contentResolver;
        this.f101249c = interfaceC35745a5;
    }

    @Y61.k
    public final O a(@Y61.k String str, @Y61.k ApiConfiguration.HttpMethod httpMethod, @Y61.k String str2, @Y61.k Map map, @Y61.k String str3) {
        b bVar = this.f101247a;
        return (!bVar.f101236b.b() ? I.l(new UnauthorizedException(null, 1, null)) : new C42007e(new com.avito.android.advert_item_actions.actions.a(httpMethod, bVar, str, str2, map)).z(bVar.f101237c.a())).r(new h(str2, str3));
    }

    @Y61.k
    public final P b(@Y61.k String str, @Y61.k ApiConfiguration.HttpMethod httpMethod, @Y61.k com.avito.android.beduin.common.component.file_uploader.validation.a aVar, @Y61.k Map map, @Y61.k String str2) {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        String str3 = aVar.f101333b;
        MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", aVar.f101335d, new C50528b(aVar.f101332a, this.f101248b, 0, null, new i(eVar, str3, str2), 12, null));
        b bVar = this.f101247a;
        V vT2 = (!bVar.f101236b.b() ? I.l(new UnauthorizedException(null, 1, null)) : new C42007e(new com.avito.android.advert_item_actions.actions.a(httpMethod, bVar, str, partCreateFormData, map)).z(bVar.f101237c.a())).r(j.f101255b).t(k.f101256b);
        InterfaceC35745a5 interfaceC35745a5 = this.f101249c;
        return eVar.C0(50L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).J(new f((io.reactivex.rxjava3.internal.observers.m) vT2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new l(eVar, str3, str2), new m(eVar, str3, str2)), 0), io.reactivex.rxjava3.internal.functions.a.f401994d);
    }
}
