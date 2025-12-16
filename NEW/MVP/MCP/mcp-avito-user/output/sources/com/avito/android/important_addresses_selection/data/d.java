package com.avito.android.important_addresses_selection.data;

import com.avito.android.important_addresses_selection.data.model.ImportantAddressesSelectionFormResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesSelectionConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/d;", "", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* compiled from: ImportantAddressesSelectionConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169699a;

        static {
            int[] iArr = new int[ImportantAddressesSelectionFormResponse.AdditionalAction.Button.ButtonType.values().length];
            try {
                iArr[ImportantAddressesSelectionFormResponse.AdditionalAction.Button.ButtonType.ADD_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImportantAddressesSelectionFormResponse.AdditionalAction.Button.ButtonType.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f169699a = iArr;
        }
    }

    @Inject
    public d() {
    }
}
