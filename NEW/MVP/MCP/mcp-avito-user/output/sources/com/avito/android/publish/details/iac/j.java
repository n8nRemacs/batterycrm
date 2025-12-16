package com.avito.android.publish.details.iac;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.publish.details.iac.g;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv.C43501a;

/* compiled from: IacPermissionRequestHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f234742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234743m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234744n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234745o;

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionSystemSettingsLink.ResultValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionSystemSettingsLink.ResultValue resultValue = PermissionSystemSettingsLink.ResultValue.f169279b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionSystemSettingsLink.ResultValue resultValue2 = PermissionSystemSettingsLink.ResultValue.f169279b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
        super(1);
        this.f234742l = str;
        this.f234743m = aVar;
        this.f234744n = aVar2;
        this.f234745o = aVar3;
    }

    @Override // Y41.l
    public final G0 invoke(C43501a c43501a) {
        PermissionSystemSettingsLink.b bVar = (PermissionSystemSettingsLink.b) c43501a.f413261b;
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f234742l);
        sb2.append(" result=");
        PermissionSystemSettingsLink.ResultValue resultValue = bVar.f169284b;
        sb2.append(resultValue);
        v22.c("IacPublishAppSettingsMicPermissionRequester", sb2.toString(), null);
        int iOrdinal = resultValue.ordinal();
        if (iOrdinal == 0) {
            this.f234743m.invoke();
        } else if (iOrdinal == 1) {
            this.f234744n.invoke();
        } else if (iOrdinal == 2) {
            ((g.c) this.f234745o).getClass();
            G0 g02 = G0.f406611a;
        }
        return G0.f406611a;
    }
}
