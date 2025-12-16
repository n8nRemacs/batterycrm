package dt;

import Y61.k;
import Y61.l;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import com.avito.android.remote.model.TypedResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;

/* compiled from: CvListInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldt/a;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC39801a {

    /* compiled from: CvListInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dt.a$a, reason: collision with other inner class name */
    public static final class C11043a {
    }

    @l
    Object a(@k Continuation<? super TypedResult<List<SearchItem>>> continuation);

    @l
    Object b();

    @l
    Object c(@k List<FilterItem> list, @l Long l12, @k Continuation<? super TypedResult<Q<Long, List<CvItem>>>> continuation);

    @l
    Object d(@k String str, @k CvStatus cvStatus, @k String str2, @k Continuation<? super TypedResult<CvItem>> continuation);

    @l
    Object e(@k Continuation<? super TypedResult<List<FilterItem>>> continuation);
}
