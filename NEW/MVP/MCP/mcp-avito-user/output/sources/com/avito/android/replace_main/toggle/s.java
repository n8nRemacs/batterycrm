package com.avito.android.replace_main.toggle;

import com.avito.android.replace_main.generated.api.api_v_1__replace_main_toggle.OkRespDataSuccessToggle;
import kotlin.Metadata;

/* compiled from: ReplaceMainToggleResponseMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_replace-main_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s {

    /* compiled from: ReplaceMainToggleResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254656a;

        static {
            int[] iArr = new int[OkRespDataSuccessToggle.Main.values().length];
            try {
                iArr[OkRespDataSuccessToggle.Main.Avito.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkRespDataSuccessToggle.Main.Business360.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f254656a = iArr;
        }
    }
}
