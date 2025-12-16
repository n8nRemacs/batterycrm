package com.avito.android.extended_profile_universal_widget_edit.edit;

import android.content.res.Resources;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import iB.InterfaceC41263a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetSectionSettingsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/n;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f153960a;

    /* compiled from: UniversalWidgetSectionSettingsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UniversalWidgetSectionModel.ImageWithTextType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType3 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType4 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public n(@Y61.k Resources resources) {
        this.f153960a = resources;
    }

    public static InterfaceC41263a.d a(UniversalWidgetSectionModel.a aVar, List list) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((InterfaceC41263a.e) it.next()).f398430a, aVar)) {
                break;
            }
            i12++;
        }
        return new InterfaceC41263a.d(list, i12 != -1 ? i12 : 0);
    }
}
