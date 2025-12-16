package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.inn.items.VerificationBannerItem;
import com.avito.android.remote.model.inn.items.VerificationButtonGroupItem;
import com.avito.android.remote.model.inn.items.VerificationButtonItem;
import com.avito.android.remote.model.inn.items.VerificationCheckboxItem;
import com.avito.android.remote.model.inn.items.VerificationDisclosureItem;
import com.avito.android.remote.model.inn.items.VerificationGroupItem;
import com.avito.android.remote.model.inn.items.VerificationInnInfoItem;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.inn.items.VerificationMultiLineInputItem;
import com.avito.android.remote.model.inn.items.VerificationSelectItem;
import com.avito.android.remote.model.inn.items.VerificationSingleLineInputItem;
import com.avito.android.remote.model.inn.items.VerificationTextItem;
import com.my.tracker.ads.AdFormat;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: VerificationInnItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/VerificationInnItemTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "<init>", "()V", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerificationInnItemTypeAdapter extends RuntimeTypeAdapter<VerificationInnItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254261a;

    public VerificationInnItemTypeAdapter() {
        super(null, "args", null, 5, null);
        this.f254261a = P0.g(new kotlin.Q("singleLineInput", VerificationSingleLineInputItem.class), new kotlin.Q("multiLineInput", VerificationMultiLineInputItem.class), new kotlin.Q("select", VerificationSelectItem.class), new kotlin.Q("disclosureSection", VerificationDisclosureItem.class), new kotlin.Q("infoItem", VerificationInnInfoItem.class), new kotlin.Q("checkbox", VerificationCheckboxItem.class), new kotlin.Q("textItem", VerificationTextItem.class), new kotlin.Q("buttonGroup", VerificationButtonGroupItem.class), new kotlin.Q("button", VerificationButtonItem.class), new kotlin.Q("groupCard", VerificationGroupItem.class), new kotlin.Q(AdFormat.BANNER, VerificationBannerItem.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254261a;
    }
}
