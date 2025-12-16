package com.avito.android.publish.start_publish;

import com.avito.android.Q1;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.remote.model.Displaying;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: StartPublishInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/publish/start_publish/e;", "advertShortcuts", "Lcom/avito/android/publish/start_publish/StartPublishSheet$SheetData$CategoryShortcutItem;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f245442b;

    public v(u uVar) {
        this.f245442b = uVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        UniversalImage universalImage;
        List<C34130e> list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C34130e c34130e : list) {
            int i12 = u.f245435g;
            u uVar = this.f245442b;
            uVar.getClass();
            AdvertPublicationLink.Local local = new AdvertPublicationLink.Local(c34130e.f245402b, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
            Q1 q12 = uVar.f245439d;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[86];
            boolean zBooleanValue = ((Boolean) q12.f67513t0.a().invoke()).booleanValue();
            Navigation navigation2 = c34130e.f245402b;
            if (zBooleanValue) {
                Displaying displaying = navigation2.getDisplaying();
                if (displaying == null || (universalImage = displaying.getLogo()) == null) {
                    universalImage = new UniversalImage(null, null);
                }
            } else {
                Integer categoryId = navigation2.getCategoryId();
                universalImage = (UniversalImage) uVar.f245441f.d(UniversalImage.class, (categoryId != null && categoryId.intValue() == 1) ? "{\"value\":{\"120x120\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_light_120x120.png\",\"160x160\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_light_160x160.png\",\"40x40\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_light_40x40.png\",\"60x60\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_light_60x60.png\",\"80x80\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_light_80x80.png\"},\"valueDark\":{\"120x120\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_dark_120x120.png\",\"160x160\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_dark_160x160.png\",\"40x40\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_dark_40x40.png\",\"60x60\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_dark_60x60.png\",\"80x80\":\"https://avito.st/static/ims/62f63cab-5c0a-4b4e-b4ce-c39e7207f1a1_publish_items_choose_vertical_auto_dark_80x80.png\"}}" : (categoryId != null && categoryId.intValue() == 4) ? "{\"value\":{\"120x120\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_light_120x120.png\",\"160x160\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_light_160x160.png\",\"40x40\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_light_40x40.png\",\"60x60\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_light_60x60.png\",\"80x80\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_light_80x80.png\"},\"valueDark\":{\"120x120\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_dark_120x120.png\",\"160x160\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_dark_160x160.png\",\"40x40\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_dark_40x40.png\",\"60x60\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_dark_60x60.png\",\"80x80\":\"https://avito.st/static/ims/74d67c3f-8d22-4437-a600-27849525f2f6_publish_items_choose_vertical_realty_dark_80x80.png\"}}" : (categoryId != null && categoryId.intValue() == 110) ? "{\"value\":{\"120x120\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_light_120x120.png\",\"160x160\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_light_160x160.png\",\"40x40\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_light_40x40.png\",\"60x60\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_light_60x60.png\",\"80x80\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_light_80x80.png\"},\"valueDark\":{\"120x120\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_dark_120x120.png\",\"160x160\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_dark_160x160.png\",\"40x40\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_dark_40x40.png\",\"60x60\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_dark_60x60.png\",\"80x80\":\"https://avito.st/static/ims/08057a9f-c04c-4dd0-a189-cd6e6276ebc6_publish_items_choose_vertical_job_dark_80x80.png\"}}" : (categoryId != null && categoryId.intValue() == 113) ? "{\"value\":{\"120x120\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_light_120x120.png\",\"160x160\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_light_160x160.png\",\"40x40\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_light_40x40.png\",\"60x60\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_light_60x60.png\",\"80x80\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_light_80x80.png\"},\"valueDark\":{\"120x120\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_dark_120x120.png\",\"160x160\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_dark_160x160.png\",\"40x40\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_dark_40x40.png\",\"60x60\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_dark_60x60.png\",\"80x80\":\"https://avito.st/static/ims/47b2f3ef-b67b-4dca-a2a9-56146182fed1_publish_items_choose_vertical_services_dark_80x80.png\"}}" : (categoryId != null && categoryId.intValue() == 8) ? "{\"value\":{\"120x120\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_light_120x120.png\",\"160x160\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_light_160x160.png\",\"40x40\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_light_40x40.png\",\"60x60\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_light_60x60.png\",\"80x80\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_light_80x80.png\"},\"valueDark\":{\"120x120\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_dark_120x120.png\",\"160x160\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_dark_160x160.png\",\"40x40\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_dark_40x40.png\",\"60x60\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_dark_60x60.png\",\"80x80\":\"https://avito.st/static/ims/d49c5edd-decb-4278-bbb5-9249e4fb268d_publish_items_choose_vertical_b2b_dark_80x80.png\"}}" : "{\"value\":{\"120x120\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_light_120x120.png\",\"160x160\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_light_160x160.png\",\"40x40\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_light_40x40.png\",\"60x60\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_light_60x60.png\",\"80x80\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_light_80x80.png\"},\"valueDark\":{\"120x120\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_dark_120x120.png\",\"160x160\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_dark_160x160.png\",\"40x40\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_dark_40x40.png\",\"60x60\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_dark_60x60.png\",\"80x80\":\"https://avito.st/static/ims/52c5d106-12cb-4d65-ad05-2c2c53543f66_publish_items_choose_vertical_goods_dark_80x80.png\"}}");
            }
            arrayList.add(new StartPublishSheet.SheetData.CategoryShortcutItem(c34130e.f245401a, c34130e.f245402b, local, universalImage, null, 16, null));
        }
        return arrayList;
    }
}
