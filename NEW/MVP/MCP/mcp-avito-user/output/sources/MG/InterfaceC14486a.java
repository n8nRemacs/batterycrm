package Mg;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.CommercialItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n2;

/* compiled from: AvlRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMg/a;", "", "_avito_avl_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14486a {

    /* compiled from: AvlRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mg.a$a, reason: collision with other inner class name */
    public static final class C0696a {
    }

    @l
    Object a(@l String str, @l String str2, @l String str3, @l String str4, @k ContinuationImpl continuationImpl);

    @l
    Object b(@l String str, @k CommercialItem commercialItem, @k ContinuationImpl continuationImpl);

    @k
    n2<c> c(@l String str);

    @l
    Object d(@l String str, @k Y41.l lVar, @k ContinuationImpl continuationImpl);

    @l
    Object e(@l String str, @k String str2, @k Continuation<? super G0> continuation);
}
