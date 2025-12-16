package com.avito.android.iac_problems.impl_module.miui_permission.ui;

import Y61.l;
import android.net.Uri;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35755b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RemoteImages.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-problems_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f168837a = C42727D.c(b.f168841l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f168838b = C42727D.c(c.f168842l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f168839c = C42727D.c(d.f168843l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f168840d = C42727D.c(e.f168844l);

    /* compiled from: RemoteImages.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MiuiBottomsheetRemoteImageLanguage.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MiuiBottomsheetRemoteImageLanguage miuiBottomsheetRemoteImageLanguage = MiuiBottomsheetRemoteImageLanguage.f168810b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: RemoteImages.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UniversalImage> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f168841l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalImage invoke() {
            return UniversalImageKt.universalImageOf(k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_86x45.png"), new Q("172x90", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_172x90.png"), new Q("258x135", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_258x135.png"), new Q("343x180", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_343x180.png"), new Q("429x225", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_429x225.png"), new Q("515x270", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_515x270.png"), new Q("601x315", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_601x315.png"), new Q("686x360", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_686x360.png"), new Q("858x450", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_light_1372x720.png"))), k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_86x45.png"), new Q("172x90", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_172x90.png"), new Q("258x135", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_258x135.png"), new Q("343x180", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_343x180.png"), new Q("429x225", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_429x225.png"), new Q("515x270", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_515x270.png"), new Q("601x315", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_601x315.png"), new Q("686x360", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_686x360.png"), new Q("858x450", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/10506e4a-1e3d-4cfb-879a-cd5864fe941d_ru_onboaring_xiaomi_banner_1_dark_1372x720.png"))));
        }
    }

    /* compiled from: RemoteImages.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<UniversalImage> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f168842l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalImage invoke() {
            return UniversalImageKt.universalImageOf(k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_86x45.png"), new Q("172x90", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_172x90.png"), new Q("258x135", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_258x135.png"), new Q("343x180", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_343x180.png"), new Q("429x225", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_429x225.png"), new Q("515x270", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_515x270.png"), new Q("601x315", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_601x315.png"), new Q("686x360", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_686x360.png"), new Q("858x450", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_light_1372x720.png"))), k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_86x45.png"), new Q("172x90", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_172x90.png"), new Q("258x135", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_258x135.png"), new Q("343x180", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_343x180.png"), new Q("429x225", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_429x225.png"), new Q("515x270", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_515x270.png"), new Q("601x315", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_601x315.png"), new Q("686x360", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_686x360.png"), new Q("858x450", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/aa4e31f6-e186-4246-bf18-0ae97a8ed875_ru_onboaring_xiaomi_banner_2_dark_1372x720.png"))));
        }
    }

    /* compiled from: RemoteImages.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<UniversalImage> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f168843l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalImage invoke() {
            return UniversalImageKt.universalImageOf(k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_86x45.png"), new Q("172x90", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_172x90.png"), new Q("258x135", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_258x135.png"), new Q("343x180", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_343x180.png"), new Q("429x225", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_429x225.png"), new Q("515x270", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_515x270.png"), new Q("601x315", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_601x315.png"), new Q("686x360", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_686x360.png"), new Q("858x450", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_light_1372x720.png"))), k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_86x45.png"), new Q("172x90", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_172x90.png"), new Q("258x135", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_258x135.png"), new Q("343x180", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_343x180.png"), new Q("429x225", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_429x225.png"), new Q("515x270", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_515x270.png"), new Q("601x315", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_601x315.png"), new Q("686x360", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_686x360.png"), new Q("858x450", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/294bc3c8-10f0-43ef-a9c5-14ad7d710e7d_uz_onboaring_xiaomi_banner_1_dark_1372x720.png"))));
        }
    }

    /* compiled from: RemoteImages.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<UniversalImage> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f168844l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalImage invoke() {
            return UniversalImageKt.universalImageOf(k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_86x45.png"), new Q("172x90", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_172x90.png"), new Q("258x135", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_258x135.png"), new Q("343x180", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_343x180.png"), new Q("429x225", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_429x225.png"), new Q("515x270", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_515x270.png"), new Q("601x315", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_601x315.png"), new Q("686x360", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_686x360.png"), new Q("858x450", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_light_1372x720.png"))), k.a(P0.g(new Q("86x45", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_86x45.png"), new Q("172x90", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_172x90.png"), new Q("258x135", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_258x135.png"), new Q("343x180", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_343x180.png"), new Q("429x225", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_429x225.png"), new Q("515x270", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_515x270.png"), new Q("601x315", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_601x315.png"), new Q("686x360", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_686x360.png"), new Q("858x450", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_858x450.png"), new Q("1029x540", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_1029x540.png"), new Q("1201x630", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_1201x630.png"), new Q("1372x720", "https://avito.st/static/ims/e1af6fc0-38ea-4fb5-a09f-88805338330e_uz_onboaring_xiaomi_banner_2_dark_1372x720.png"))));
        }
    }

    public static final Image a(Map map) {
        Integer numY0;
        C42770s0 c42770s0B = P0.b(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c42770s0B.f406743a.iterator();
        while (true) {
            Size size = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            List listF0 = C43066x.f0((String) entry.getKey(), new String[]{"x"}, 0, 4);
            if (listF0.size() == 2 && (numY0 = C43066x.y0((String) listF0.get(0))) != null) {
                int iIntValue = numY0.intValue();
                Integer numY02 = C43066x.y0((String) listF0.get(1));
                if (numY02 != null) {
                    size = new Size(iIntValue, numY02.intValue());
                }
            }
            linkedHashMap.put(size, Uri.parse((String) entry.getValue()));
        }
        LinkedHashMap linkedHashMapB = C35755b0.b(linkedHashMap);
        if (linkedHashMapB.isEmpty()) {
            return null;
        }
        return new Image(linkedHashMapB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final Float b(@Y61.k UniversalImage universalImage, float f12) {
        Map<Size, Uri> variants;
        List listO;
        Q q12;
        Size size;
        Image image = universalImage.getImage();
        if (image == null || (variants = image.getVariants()) == null || (listO = P0.o(variants)) == null || (q12 = (Q) C42745f0.G(listO)) == null || (size = (Size) q12.f406619b) == null) {
            return null;
        }
        return Float.valueOf((f12 * size.getHeight()) / size.getWidth());
    }
}
