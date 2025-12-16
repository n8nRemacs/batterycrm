package com.avito.android.publish.objects;

import com.avito.android.blueprints.publish.header.HeaderItem;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import com.avito.android.remote.model.search.Theme;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ObjectFillFormHeaderProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/j;", "Lcom/avito/android/publish/items/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33953j implements com.avito.android.publish.items.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<ObjectsParameter> f238046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f238047b = C42727D.c(new a());

    /* compiled from: ObjectFillFormHeaderProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/blueprints/publish/header/HeaderItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.objects.j$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<HeaderItem> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final HeaderItem invoke() {
            String title;
            C33953j c33953j = C33953j.this;
            DisplayingOptions displayingOptions = c33953j.f238046a.get().getDisplayingOptions();
            if (displayingOptions == null || (title = displayingOptions.getEditScreenTitle()) == null) {
                title = c33953j.f238046a.get().getTitle();
            }
            return new HeaderItem("object_fill_form_header_id", title, (String) null, (String) null, false, (Integer) null, (Integer) null, (SectionSeparatorSlotConfig.Tooltip) null, (Theme) null, false, 1016, (C42822w) null);
        }
    }

    public C33953j(@Y61.k h31.e<ObjectsParameter> eVar) {
        this.f238046a = eVar;
    }

    @Override // com.avito.android.publish.items.e
    @Y61.k
    public final com.avito.conveyor_item.a a() {
        return (com.avito.conveyor_item.a) this.f238047b.getValue();
    }
}
