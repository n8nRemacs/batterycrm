package Fc1;

import Fc1.B3;
import Fc1.F7;
import android.content.ContentValues;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.android.volley.ClientError;
import com.avito.android.publish.drafts.LocalPublishState;
import com.google.gson.Gson;
import feedback.shared.sdk.api.network.entities.Answer;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import feedback.shared.sdk.api.network.entities.CampaignRecord;
import feedback.shared.sdk.api.network.entities.FieldResult;
import feedback.shared.sdk.api.network.entities.GetCampaignsResponse;
import feedback.shared.sdk.api.network.entities.PageResult;
import feedback.shared.sdk.api.network.entities.PostScreenshotResponse;
import feedback.shared.sdk.api.network.entities.PostVisitsResponse;
import feedback.shared.sdk.api.network.entities.RequestType;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.observable.C41992u0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42829l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class U3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C13607f1 f5221a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13611f5 f5222b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13753v4 f5223c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R6 f5224d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final U1 f5225e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final F1 f5226f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AtomicInteger f5227g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AtomicInteger f5228h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f5229i;

    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) throws xyz.n.a.f3 {
            long jLongValue = ((Number) obj).longValue();
            U3 u32 = U3.this;
            C13747u7 c13747u7 = u32.f5224d.f5165a;
            try {
                Cursor cursorQuery = c13747u7.getReadableDatabase().query("REQUEST_CACHE", new String[]{"CAST (COUNT(*) AS INTEGER)"}, null, null, null, null, null);
                try {
                    Y4.a(cursorQuery);
                    cursorQuery.moveToNext();
                    int i12 = cursorQuery.getInt(0);
                    int i13 = kotlin.jvm.internal.J.f406821a;
                    boolean z12 = i12 == 0;
                    kotlin.io.c.a(cursorQuery, null);
                    AtomicInteger atomicInteger = u32.f5228h;
                    if (!z12 && atomicInteger.compareAndSet(0, 0) && u32.f5229i.compareAndSet(false, true)) {
                        return io.reactivex.rxjava3.core.z.c0(Long.valueOf(jLongValue));
                    }
                    if (atomicInteger.get() != 0) {
                        u32.f5222b.c(xyz.n.a.j2.RETRY_TIME, String.valueOf(atomicInteger.decrementAndGet()));
                    }
                    return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
                } finally {
                }
            } catch (Exception e12) {
                c13747u7.getClass();
                try {
                    c13747u7.close();
                } catch (Exception unused) {
                }
                try {
                    c13747u7.f5852b.deleteDatabase("feedbackCache");
                } catch (Exception unused2) {
                }
                throw new xyz.n.a.f3(e12);
            }
        }
    }

    @kotlin.jvm.internal.s0
    public static final class b<T, R> implements l41.o {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5232a;

            static {
                int[] iArr = new int[RequestType.values().length];
                try {
                    iArr[RequestType.GET_CAMPAIGNS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RequestType.POST_VISITS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RequestType.POST_ANSWERS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RequestType.POST_SCREENSHOT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f5232a = iArr;
            }
        }

        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) throws xyz.n.a.f3 {
            Object objD;
            Object objD2;
            int i12 = 3;
            ((Number) obj).longValue();
            U3 u32 = U3.this;
            B3 b3B = u32.f5224d.b();
            RequestType requestType = b3B != null ? b3B.f4822a : null;
            int i13 = requestType == null ? -1 : a.f5232a[requestType.ordinal()];
            if (i13 == 1) {
                return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new C13646j4(u32, null));
            }
            C13607f1 c13607f1 = u32.f5221a;
            String str = "";
            if (i13 == 2) {
                int i14 = B3.a.f4824a[b3B.f4822a.ordinal()];
                if (i14 == 1) {
                    throw new kotlin.G(null, 1, null);
                }
                String str2 = b3B.f4823b;
                if (i14 == 2) {
                    Integer numValueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
                    if (numValueOf == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    objD = numValueOf;
                } else if (i14 == 3) {
                    D6 d62 = F7.a.f4960a;
                    ((InterfaceC13766x) (d62 != null ? d62 : null).f4854B.f393949a).get();
                    if (str2 == null) {
                        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                    } else {
                        str = str2;
                    }
                    objD = (Integer) C13587d.a(str);
                } else {
                    if (i14 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    D6 d63 = F7.a.f4960a;
                    objD = ((Gson) (d63 != null ? d63 : null).f4886y.get()).d(Integer.class, str2);
                }
                return new C42006d(new C13589d1(c13607f1, ((Number) objD).intValue()));
            }
            if (i13 == 3) {
                return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new C13789z4(u32, b3B, null));
            }
            if (i13 != 4) {
                return io.reactivex.rxjava3.internal.operators.single.Q.f404516b;
            }
            int i15 = B3.a.f4824a[b3B.f4822a.ordinal()];
            if (i15 == 1) {
                throw new kotlin.G(null, 1, null);
            }
            String str3 = b3B.f4823b;
            if (i15 == 2) {
                Integer numValueOf2 = str3 != null ? Integer.valueOf(Integer.parseInt(str3)) : null;
                if (numValueOf2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.String>");
                }
                objD2 = (kotlin.Q) numValueOf2;
            } else if (i15 == 3) {
                D6 d64 = F7.a.f4960a;
                ((InterfaceC13766x) (d64 != null ? d64 : null).f4854B.f393949a).get();
                if (str3 == null) {
                    kotlin.jvm.internal.u0 u0Var2 = kotlin.jvm.internal.u0.f406856a;
                } else {
                    str = str3;
                }
                objD2 = (kotlin.Q) C13587d.a(str);
            } else {
                if (i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                D6 d65 = F7.a.f4960a;
                objD2 = ((Gson) (d65 != null ? d65 : null).f4886y.get()).d(kotlin.Q.class, str3);
            }
            return new C42006d(new Ba1.B(i12, (kotlin.Q) objD2, c13607f1));
        }
    }

    @kotlin.jvm.internal.s0
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) throws xyz.n.a.f3 {
            int i12;
            Throwable th2 = (Throwable) obj;
            U3 u32 = U3.this;
            u32.f5229i.set(false);
            boolean z12 = th2 instanceof xyz.n.a.f3;
            C13611f5 c13611f5 = u32.f5222b;
            if (z12) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    c13611f5.a(cause);
                    return;
                }
                return;
            }
            c13611f5.a(th2);
            AtomicInteger atomicInteger = u32.f5227g;
            int i13 = kotlin.jvm.internal.J.f406821a;
            InterfaceC13753v4 interfaceC13753v4 = u32.f5223c;
            atomicInteger.compareAndSet(-1, interfaceC13753v4.j());
            if (atomicInteger.compareAndSet(0, -1) || ((th2 instanceof ClientError) && ((i12 = ((ClientError) th2).f67046b.f67099a) == 410 || i12 == 413))) {
                u32.f5224d.a();
                c13611f5.b(xyz.n.a.j2.DEQUEUE_ON_ERROR);
            } else {
                u32.f5228h.set(interfaceC13753v4.e());
                c13611f5.c(xyz.n.a.j2.RETRY_COUNT, String.valueOf(atomicInteger.decrementAndGet() + 1));
                c13611f5.c(xyz.n.a.j2.RETRY_TIME, String.valueOf(interfaceC13753v4.e()));
            }
        }
    }

    public static final class d<T> implements l41.g {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5235a;

            static {
                int[] iArr = new int[RequestType.values().length];
                try {
                    iArr[RequestType.GET_CAMPAIGNS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RequestType.POST_VISITS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RequestType.POST_ANSWERS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RequestType.POST_SCREENSHOT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f5235a = iArr;
            }
        }

        public d() {
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(@Y61.k Object obj) throws xyz.n.a.f3 {
            C13611f5 c13611f5;
            U3 u32 = U3.this;
            B3 b3B = u32.f5224d.b();
            RequestType requestType = b3B != null ? b3B.f4822a : null;
            int i12 = requestType == null ? -1 : a.f5235a[requestType.ordinal()];
            C13611f5 c13611f52 = u32.f5222b;
            if (i12 != 1) {
                if (i12 == 2) {
                    c13611f52.c(xyz.n.a.j2.EVENT_START, ((PostVisitsResponse) obj).getMessage());
                    return;
                } else if (i12 == 3) {
                    c13611f52.c(xyz.n.a.j2.EVENT_DONE, ((Answer) obj).getMessage());
                    return;
                } else {
                    if (i12 != 4) {
                        return;
                    }
                    c13611f52.c(xyz.n.a.j2.EVENT_SCREENSHOT, ((PostScreenshotResponse) obj).getStatus());
                    return;
                }
            }
            GetCampaignsResponse getCampaignsResponse = (GetCampaignsResponse) obj;
            c13611f52.c(xyz.n.a.j2.CAMPAIGNS_SYNC, String.valueOf(getCampaignsResponse.getCampaigns().size()));
            U1 u12 = u32.f5225e;
            List<CampaignRecord> campaigns = getCampaignsResponse.getCampaigns();
            ArrayList arrayList = new ArrayList();
            C13747u7 c13747u7 = u12.f5209a;
            Cursor cursorQuery = c13747u7.getReadableDatabase().query("CAMPAIGNS_LIST", new String[]{"CAMPAIGN_ID"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(Integer.valueOf(cursorQuery.getInt(0)));
                } catch (Throwable th2) {
                }
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            kotlin.io.c.a(cursorQuery, null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(campaigns, 10));
                Iterator<T> it2 = campaigns.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((CampaignRecord) it2.next()).getCampaignId()));
                }
                if (!arrayList2.contains(Integer.valueOf(iIntValue))) {
                    c13747u7.getWritableDatabase().delete("CAMPAIGNS_LIST", "CAMPAIGN_ID=?", new String[]{String.valueOf(iIntValue)});
                }
            }
            for (CampaignRecord campaignRecord : campaigns) {
                if (campaignRecord.getEventName() != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("CAMPAIGN_ID", Integer.valueOf(campaignRecord.getCampaignId()));
                    contentValues.put("CAMPAIGN_PRIORITY", Integer.valueOf(campaignRecord.getPriority()));
                    contentValues.put("CAMPAIGN_EVENT_NAME", campaignRecord.getEventName());
                    contentValues.put("CAMPAIGN_DATA", campaignRecord.getData());
                    c13747u7.getWritableDatabase().insertWithOnConflict("CAMPAIGNS_LIST", null, contentValues, 5);
                }
                if (campaignRecord.getEventName() == null) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("CAMPAIGN_PRIORITY", Integer.valueOf(campaignRecord.getPriority()));
                    if (arrayList.contains(Integer.valueOf(campaignRecord.getCampaignId()))) {
                        c13747u7.getWritableDatabase().update("CAMPAIGNS_LIST", contentValues2, "CAMPAIGN_ID=?", new String[]{String.valueOf(campaignRecord.getCampaignId())});
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Cursor cursorQuery2 = c13747u7.getReadableDatabase().query("CAMPAIGNS_LIST", new String[]{"CAMPAIGN_ID", "CAMPAIGN_PRIORITY", "CAMPAIGN_EVENT_NAME"}, null, null, null, null, null);
            while (cursorQuery2.moveToNext()) {
                try {
                    arrayList3.add(new C42829l0(Integer.valueOf(cursorQuery2.getInt(0)), Integer.valueOf(cursorQuery2.getInt(1)), cursorQuery2.getString(2)));
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            kotlin.G0 g03 = kotlin.G0.f406611a;
            kotlin.io.c.a(cursorQuery2, null);
            Iterator it3 = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                c13611f5 = u12.f5210b;
                if (!zHasNext) {
                    break;
                }
                C42829l0 c42829l0 = (C42829l0) it3.next();
                c13611f5.c(xyz.n.a.j2.CAMPAIGN_RESULT, String.valueOf(((Number) c42829l0.f406871b).intValue()), String.valueOf(((Number) c42829l0.f406872c).intValue()), (String) c42829l0.f406873d);
            }
            if (!arrayList3.isEmpty()) {
                c13611f5.b(xyz.n.a.j2.READY);
                try {
                    u12.f5211c.a();
                } catch (Exception unused) {
                }
            }
            u32.f5226f.f4952a = getCampaignsResponse.getCopyright();
            Integer showCampaignsInterval = getCampaignsResponse.getShowCampaignsInterval();
            if (showCampaignsInterval != null) {
                u32.f5223c.a(showCampaignsInterval.intValue());
            }
        }
    }

    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            U3.this.f5229i.set(false);
        }
    }

    public static final class f<T, R> implements l41.o {
        public f() {
        }

        @Override // l41.o
        public final Object apply(Object obj) throws xyz.n.a.f3 {
            U3 u32 = U3.this;
            u32.f5224d.a();
            u32.f5229i.set(false);
            AtomicInteger atomicInteger = u32.f5227g;
            int i12 = kotlin.jvm.internal.J.f406821a;
            atomicInteger.set(-1);
            return kotlin.G0.f406611a;
        }
    }

    public U3(@Y61.k C13607f1 c13607f1, @Y61.k C13611f5 c13611f5, @Y61.k InterfaceC13753v4 interfaceC13753v4, @Y61.k R6 r62, @Y61.k U1 u12, @Y61.k F1 f12) {
        this.f5221a = c13607f1;
        this.f5222b = c13611f5;
        this.f5223c = interfaceC13753v4;
        this.f5224d = r62;
        this.f5225e = u12;
        this.f5226f = f12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f5227g = new AtomicInteger(-1);
        this.f5228h = new AtomicInteger(0);
        this.f5229i = new AtomicBoolean(false);
        C41992u0 c41992u0A0 = io.reactivex.rxjava3.core.z.a0(1000L, 1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404943c;
        io.reactivex.rxjava3.core.z zVarT = c41992u0A0.x0(h12).j0(h12).T(new a(), Integer.MAX_VALUE);
        b bVar = new b();
        zVarT.getClass();
        io.reactivex.rxjava3.internal.operators.observable.O oI2 = new C41936b0(zVarT, bVar).I(new c()).j0(h12).K(new d()).I(new e());
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.Z0(oI2, rVar).d0(new f()).s0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final kotlin.G0 a(@Y61.k RequestType requestType, @Y61.l Object obj) throws xyz.n.a.f3, JSONException {
        String string;
        int i12;
        RequestType requestType2 = RequestType.GET_CAMPAIGNS;
        C13747u7 c13747u7 = this.f5224d.f5165a;
        if (requestType == requestType2) {
            try {
                Cursor cursorQuery = c13747u7.getReadableDatabase().query("REQUEST_CACHE", null, null, null, null, null, "REQUEST_ID DESC", "1");
                try {
                    Y4.a(cursorQuery);
                    cursorQuery.moveToNext();
                    int count = cursorQuery.getCount();
                    int i13 = kotlin.jvm.internal.J.f406821a;
                    B3 b32 = count == 0 ? null : new B3(RequestType.values()[cursorQuery.getInt(1)], cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                    kotlin.io.c.a(cursorQuery, null);
                    if ((b32 != null ? b32.f4822a : null) == requestType2) {
                        return kotlin.G0.f406611a;
                    }
                } finally {
                }
            } catch (Exception e12) {
                c13747u7.getClass();
                try {
                    c13747u7.close();
                } catch (Exception unused) {
                }
                try {
                    c13747u7.f5852b.deleteDatabase("feedbackCache");
                } catch (Exception unused2) {
                }
                throw new xyz.n.a.f3(e12);
            }
        }
        if (obj == null || (i12 = C13582c3.f5437a[requestType.ordinal()]) == 1) {
            string = null;
        } else if (i12 == 2) {
            string = obj.toString();
        } else if (i12 != 3) {
            D6 d62 = F7.a.f4960a;
            if (d62 == null) {
                d62 = null;
            }
            string = ((Gson) d62.f4886y.get()).l(obj);
        } else {
            D6 d63 = F7.a.f4960a;
            if (d63 == null) {
                d63 = null;
            }
            ((InterfaceC13766x) d63.f4854B.f393949a).get();
            CampaignPagesResult campaignPagesResult = (CampaignPagesResult) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignId", campaignPagesResult.getCampaignId());
            jSONObject.put("projectId", campaignPagesResult.getProjectId());
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ", Locale.getDefault()).format(campaignPagesResult.getCreatedAtClient());
            jSONObject.put("createdAtClient", new StringBuilder(str).insert(str.length() - 2, ':').toString());
            JSONArray jSONArray = new JSONArray();
            for (PageResult pageResult : campaignPagesResult.getPages()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pageId", pageResult.getPageId());
                jSONObject2.put("close", pageResult.getClose());
                jSONObject2.put("externalLink", pageResult.getExternalLink());
                JSONArray jSONArray2 = new JSONArray();
                for (FieldResult fieldResult : pageResult.getFields()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("fieldId", fieldResult.getFieldId());
                    jSONObject3.put("type", fieldResult.getType().name());
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator<T> it = fieldResult.getValues().iterator();
                    while (it.hasNext()) {
                        jSONArray3.put((String) it.next());
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    jSONObject3.put("values", jSONArray3);
                    JSONArray jSONArray4 = new JSONArray();
                    Iterator<T> it2 = fieldResult.getScenarios().iterator();
                    while (it2.hasNext()) {
                        jSONArray4.put((String) it2.next());
                    }
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                    jSONObject3.put("scenarios", jSONArray4);
                    JSONArray jSONArray5 = new JSONArray();
                    Iterator<T> it3 = fieldResult.getPositions().iterator();
                    while (it3.hasNext()) {
                        jSONArray5.put(((Number) it3.next()).intValue());
                    }
                    kotlin.G0 g04 = kotlin.G0.f406611a;
                    jSONObject3.put("positions", jSONArray5);
                    jSONObject3.put("screenshots", new JSONArray());
                    jSONArray2.put(jSONObject3);
                }
                kotlin.G0 g05 = kotlin.G0.f406611a;
                jSONObject2.put(LocalPublishState.FIELDS, jSONArray2);
                jSONArray.put(jSONObject2);
            }
            kotlin.G0 g06 = kotlin.G0.f406611a;
            jSONObject.put("pages", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, String> entry : campaignPagesResult.getProperties().entrySet()) {
                jSONObject4.put(entry.getKey(), entry.getValue());
            }
            kotlin.G0 g07 = kotlin.G0.f406611a;
            jSONObject.put("properties", jSONObject4);
            string = jSONObject.toString();
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(CredentialProviderBaseController.REQUEST_TAG, Integer.valueOf(requestType.ordinal()));
            contentValues.put("REQUEST_PAYLOAD", string);
            c13747u7.getWritableDatabase().insert("REQUEST_CACHE", null, contentValues);
            return kotlin.G0.f406611a;
        } catch (Exception e13) {
            c13747u7.getClass();
            try {
                c13747u7.close();
            } catch (Exception unused3) {
            }
            try {
                c13747u7.f5852b.deleteDatabase("feedbackCache");
            } catch (Exception unused4) {
            }
            throw new xyz.n.a.f3(e13);
        }
    }
}
