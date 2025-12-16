package com.avito.android.advert.viewed.persistance;

import androidx.room.A;
import androidx.room.InterfaceC23458l0;
import androidx.room.W;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ViewedAdvertsDao.kt */
@A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/viewed/persistance/b;", "", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {
    @InterfaceC23458l0
    @Y61.l
    Object a(@Y61.k Continuation continuation);

    @InterfaceC23458l0
    @Y61.k
    InterfaceC43160i<List<String>> b();

    @Y61.l
    @W
    Object c(@Y61.k List<a> list, @Y61.k Continuation<? super G0> continuation);

    @InterfaceC23458l0
    @Y61.k
    InterfaceC43160i d();

    @Y61.l
    @W
    Object e(@Y61.k a aVar, @Y61.k Continuation<? super G0> continuation);

    @InterfaceC23458l0
    @Y61.l
    Object f(@Y61.k Continuation<? super Long> continuation);
}
