package com.avito.android.ai_assistant.model;

import com.avito.android.ai_assistant.generated.api.open_v_2.OkRespDataSuccessElementsItem2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OpenV2ResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ai-assistant_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: OpenV2ResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89136a;

        static {
            int[] iArr = new int[OkRespDataSuccessElementsItem2.OkRespDataSuccessElementsItem2Message.Author.values().length];
            try {
                iArr[OkRespDataSuccessElementsItem2.OkRespDataSuccessElementsItem2Message.Author.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkRespDataSuccessElementsItem2.OkRespDataSuccessElementsItem2Message.Author.Assistant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89136a = iArr;
        }
    }
}
