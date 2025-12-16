package com.avito.android.ai_assistant.adapter;

import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItem;
import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItemMessageSegmentsItem;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/c;", "Lcom/avito/android/ai_assistant/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f88776a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f88777b;

    /* compiled from: AiAssistantItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88778a;

        static {
            int[] iArr = new int[OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage.Author.values().length];
            try {
                iArr[OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage.Author.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage.Author.Assistant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88778a = iArr;
        }
    }

    @Inject
    public c(@Y61.k k kVar, @Y61.k e eVar) {
        this.f88776a = kVar;
        this.f88777b = eVar;
    }

    @Override // com.avito.android.ai_assistant.adapter.b
    @Y61.k
    public final ArrayList a(@Y61.k OkRespDataSuccessElementsItem okRespDataSuccessElementsItem) {
        ArrayList arrayList = new ArrayList();
        if (okRespDataSuccessElementsItem instanceof OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage) {
            OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage okRespDataSuccessElementsItemMessage = (OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage) okRespDataSuccessElementsItem;
            for (OkRespDataSuccessElementsItemMessageSegmentsItem okRespDataSuccessElementsItemMessageSegmentsItem : okRespDataSuccessElementsItemMessage.c()) {
                int i12 = a.f88778a[okRespDataSuccessElementsItemMessage.getAuthor().ordinal()];
                if (i12 == 1) {
                    arrayList.add(this.f88776a.a(okRespDataSuccessElementsItemMessageSegmentsItem, okRespDataSuccessElementsItemMessage.getId()));
                } else if (i12 == 2) {
                    arrayList.add(this.f88777b.a(okRespDataSuccessElementsItemMessageSegmentsItem, okRespDataSuccessElementsItemMessage.getId()));
                }
            }
        }
        return C42745f0.C(arrayList);
    }
}
