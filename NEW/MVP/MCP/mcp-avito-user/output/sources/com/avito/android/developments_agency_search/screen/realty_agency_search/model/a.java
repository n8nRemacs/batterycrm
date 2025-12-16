package com.avito.android.developments_agency_search.screen.realty_agency_search.model;

import Y61.k;
import android.net.Uri;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Images.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f138682a = C42727D.c(c.f138687l);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f138683b = C42727D.c(C4184a.f138685l);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f138684c = C42727D.c(b.f138686l);

    /* compiled from: Images.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/Image;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.model.a$a, reason: collision with other inner class name */
    public static final class C4184a extends N implements Y41.a<Image> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4184a f138685l = new C4184a();

        public C4184a() {
            super(0);
        }

        @Override // Y41.a
        public final Image invoke() {
            return new Image(P0.g(new Q(new Size(29, 14), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_dark_29x14.png")), new Q(new Size(58, 28), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_dark_58x28.png")), new Q(new Size(87, 42), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_dark_87x42.png")), new Q(new Size(116, 55), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_dark_116x55.png"))));
        }
    }

    /* compiled from: Images.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UniversalImage> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f138686l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalImage invoke() {
            return new UniversalImage((Image) a.f138682a.getValue(), (Image) a.f138683b.getValue());
        }
    }

    /* compiled from: Images.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/Image;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Image> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f138687l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Image invoke() {
            return new Image(P0.g(new Q(new Size(29, 14), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_light_29x14.png")), new Q(new Size(58, 28), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_light_58x28.png")), new Q(new Size(87, 42), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_light_87x42.png")), new Q(new Size(116, 55), Uri.parse("https://avito.st/static/ims/f4ca8521-f174-4c4f-a87f-2128765808f4_bottom_navigation_image_mobile_light_116x55.png"))));
        }
    }
}
