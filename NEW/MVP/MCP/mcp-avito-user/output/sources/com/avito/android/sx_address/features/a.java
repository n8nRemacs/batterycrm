package com.avito.android.sx_address.features;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: SxAddressFeatures.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/features/a;", "Lcom/avito/android/A0;", "<init>", "()V", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f293009d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f293010b = A0.u(this, "Переключение endpoint для доступа к file storage во флоу подветрждения адреса по видео", "sx_address_video_verification_file_storage_endpoint", new OptionSet("https://files.avito.ru/upload/", C42745f0.U("https://files.avito.ru/upload/", "https://files-staging.k.avito.ru/upload/")), false, 0, Owners.f210444S2, 40);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f293011c = A0.u(this, "Свитчер для возможности пользователя скрыть свой точный адрес", "sx_address_show_hide_address_switcher", Boolean.TRUE, true, 0, Owners.f210489g0, 40);

    /* compiled from: SxAddressFeatures.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/sx_address/features/a$a;", "", "<init>", "()V", "", "PROD_FILE_STORAGE_ENDPOINT", "Ljava/lang/String;", "STAGING_FILE_STORAGE_ENDPOINT", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.features.a$a, reason: collision with other inner class name */
    public static final class C8900a {
        public /* synthetic */ C8900a(C42822w c42822w) {
            this();
        }

        public C8900a() {
        }
    }

    static {
        h0 h0Var = new h0(a.class, "sxAddressVideoVerificationFileStorageEndpoint", "getSxAddressVideoVerificationFileStorageEndpoint()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f293009d = new n[]{n0Var.i(h0Var), C0.k(a.class, "sxAddressHideAddressSwitcher", "getSxAddressHideAddressSwitcher()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
        new C8900a(null);
    }
}
