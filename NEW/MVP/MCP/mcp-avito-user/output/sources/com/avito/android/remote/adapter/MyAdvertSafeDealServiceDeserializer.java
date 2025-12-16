package com.avito.android.remote.adapter;

import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertSafeDealServiceDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/adapter/MyAdvertSafeDealServiceDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service;", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyAdvertSafeDealServiceDeserializer implements h<MyAdvertSafeDeal.Service> {

    /* compiled from: MyAdvertSafeDealServiceDeserializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f253074a;

        static {
            int[] iArr = new int[MyAdvertSafeDeal.Service.Type.values().length];
            try {
                iArr[MyAdvertSafeDeal.Service.Type.LIST_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyAdvertSafeDeal.Service.Type.SWITCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyAdvertSafeDeal.Service.Type.TAPABLE_LIST_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f253074a = iArr;
        }
    }

    @Override // com.google.gson.h
    public final MyAdvertSafeDeal.Service deserialize(i iVar, Type type, g gVar) {
        MyAdvertSafeDeal.Service.Content content;
        k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        MyAdvertSafeDeal.Service.Type type2 = (MyAdvertSafeDeal.Service.Type) (iVarD == null ? null : gVar.b(iVarD, MyAdvertSafeDeal.Service.Type.class));
        i iVarD2 = kVarI.D("content");
        int i12 = type2 == null ? -1 : a.f253074a[type2.ordinal()];
        if (i12 == -1) {
            throw new IllegalStateException("Unsupported type");
        }
        if (i12 == 1) {
            content = (MyAdvertSafeDeal.Service.Content) gVar.b(iVarD2, MyAdvertSafeDeal.Service.Content.ListItem.class);
        } else if (i12 == 2) {
            content = (MyAdvertSafeDeal.Service.Content) gVar.b(iVarD2, MyAdvertSafeDeal.Service.Content.Switcher.class);
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            content = (MyAdvertSafeDeal.Service.Content) gVar.b(iVarD2, MyAdvertSafeDeal.Service.Content.ClickableListItem.class);
        }
        return new MyAdvertSafeDeal.Service(type2, content);
    }
}
