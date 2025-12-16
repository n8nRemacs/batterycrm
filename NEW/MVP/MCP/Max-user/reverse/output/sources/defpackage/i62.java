package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.Collator;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class i62 implements a88, dcb, frf, b9e, qb6, rl3, gu3, sx3, w2f, ExtLogger.TimeProvider, vm, ParticipantsUpdater.MeChanger, ExternalIdsResolver.ExtraResolver, qa8, oa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i62(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a88
    public void a(View view, String str) {
        ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
        int i = ChangeDisabledDialog.C0;
        azi.a(changeDisabledDialog, str, new qk(5, changeDisabledDialog));
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        sv3 sv3Var;
        int i = this.a;
        wv3 wv3Var = null;
        tv3 tv3Var = null;
        w10VarC = null;
        w10 w10VarC = null;
        Object obj2 = this.b;
        switch (i) {
            case 13:
                tbf tbfVar = (tbf) obj2;
                rv3 rv3Var = (rv3) obj;
                if (tbfVar != null) {
                    xy xyVar = tbfVar.a;
                    if (xyVar != null && xyVar.a == s00.PHOTO) {
                        w10VarC = po8.c(xyVar, null, 0L, 0L);
                    }
                    wib wibVar = tbfVar.b;
                    wv3Var = new wv3(w10VarC, (String) wibVar.b, po8.s((List) wibVar.c));
                }
                rv3Var.w = wv3Var;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((rv3) obj).i = (xv3) obj2;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ytb ytbVar = (ytb) obj2;
                rv3 rv3Var2 = (rv3) obj;
                String str = ytbVar.s0;
                String str2 = ytbVar.Y;
                if (l8g.c(str)) {
                    rv3Var2.d = "";
                } else {
                    rv3Var2.d = ytbVar.s0;
                }
                List list = rv3Var2.f;
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    sv3Var = sv3.b;
                    if (zHasNext) {
                        tv3 tv3Var2 = (tv3) it.next();
                        if (tv3Var2.c == sv3Var) {
                            tv3Var = tv3Var2;
                        }
                    }
                }
                if (tv3Var != null) {
                    list.remove(tv3Var);
                }
                if (!l8g.c(str2)) {
                    String str3 = ytbVar.Z;
                    list.add(new tv3(str2, sv3Var, str3 != null ? str3 : ""));
                }
                rv3Var2.f = list;
                break;
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            case 18:
            default:
                Throwable th = (Throwable) obj;
                wqi.c("w14", th.getMessage(), new Object[0]);
                ((y3b) ((yi5) obj2)).a(th);
                break;
            case 19:
                ((w14) obj2).b();
                break;
        }
    }

    @Override // defpackage.sx3
    public boolean b(int i) {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        return i == contactListWidget.u0.j() - (contactListWidget.Z.j() + contactListWidget.X.j());
    }

    @Override // defpackage.qa8
    public void c(Object obj, z16 z16Var) {
        fl5 fl5Var = (fl5) obj;
        SparseArray sparseArray = ((mj4) this.b).o;
        SparseBooleanArray sparseBooleanArray = z16Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = z16Var.a(i);
            hd hdVar = (hd) sparseArray.get(iA);
            hdVar.getClass();
            sparseArray2.append(iA, hdVar);
        }
        fl5Var.getClass();
    }

    public c32 d(u5i u5iVar) throws IOException {
        j62 j62Var = (j62) this.b;
        URL url = (URL) u5iVar.a;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(j62Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
        httpURLConnection.setRequestProperty(HTTP.USER_AGENT, "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) u5iVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    a3b a3bVar = j62Var.a;
                    k90 k90Var = (k90) u5iVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    pw7 pw7Var = (pw7) a3bVar.b;
                    ey7 ey7Var = new ey7(bufferedWriter, pw7Var.a, pw7Var.b, pw7Var.c, pw7Var.d);
                    ey7Var.f(k90Var);
                    ey7Var.h();
                    ey7Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    iri.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HTTP.CONTENT_TYPE));
                    iri.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c32(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c32(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c32 c32Var = new c32(responseCode, (URL) null, ra0.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c32Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            iri.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c32(HttpStatus.SC_BAD_REQUEST, (URL) null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            iri.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c32(500, (URL) null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            iri.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c32(500, (URL) null, 0L);
        } catch (IOException e4) {
            e = e4;
            iri.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c32(HttpStatus.SC_BAD_REQUEST, (URL) null, 0L);
        }
    }

    public void e(mb6 mb6Var) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
        yy7[] yy7VarArr = ChatsListWidget.L0;
        k53 k53VarB0 = chatsListWidget.B0();
        k53VarB0.getClass();
        String name = k53.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.o;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "onFolderWidgetClicked " + mb6Var, null);
            }
        }
        lb6 lb6Var = mb6Var.o;
        if (lb6Var instanceof kb6) {
            String str = ((kb6) lb6Var).a;
            gw0.w(gw0.u(new g56(((s78) k53VarB0.D0.getValue()).f(str), new g43(k53VarB0, str, null), 1), ((q2b) k53VarB0.Y).b()), k53VarB0.a);
        } else if (lb6Var instanceof jb6) {
            jb6 jb6Var = (jb6) lb6Var;
            xfh.r(k53VarB0.T0, a63.O0(a63.c, jb6Var.a, ukh.d, jb6Var.b, jb6Var.c, 8));
        } else if (lb6Var != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.b9e
    public int g(int i) {
        koe koeVar = ((ChatNotificationsSettingsScreen) this.b).c;
        ioe ioeVar = (ioe) ((t98) koeVar.C(i));
        if (ioeVar.t() == 0) {
            return 4;
        }
        if (i == koeVar.j() - 1) {
            return 3;
        }
        ioe ioeVar2 = (ioe) ((t98) koeVar.C(i - 1));
        ioe ioeVar3 = (ioe) ((t98) koeVar.C(i + 1));
        if (ioeVar.t() != ioeVar2.t()) {
            return 1;
        }
        return ioeVar.t() != ioeVar3.t() ? 3 : 2;
    }

    @Override // defpackage.frf
    public Object get() {
        ((Runnable) this.b).run();
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.log.ExtLogger.TimeProvider
    public long getCurrentTimeMillis() {
        return ((Clock) this.b).millis();
    }

    @Override // defpackage.vm
    public um h() {
        return ConversationFactory.lambda$joinAnonByLink$14((JoinAnonByLinkParams) this.b);
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        i2fVar.a(Collator.getInstance(((z7c) this.b).a.u()));
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        PlaybackException playbackException = (PlaybackException) this.b;
        ((fl5) obj).getClass();
        wqi.e("fl5", "onPlayerError", playbackException);
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return this.b;
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        int i = this.a;
        jd9 jd9Var = jd9.a;
        ecb ecbVar2 = ecb.o;
        Object obj = this.b;
        switch (i) {
            case 4:
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) obj;
                yy7[] yy7VarArr = ChatAdminsScreen.u0;
                if (ecbVar != ecbVar2) {
                    chatAdminsScreen.y0().u();
                    break;
                } else {
                    xfh.r(chatAdminsScreen.A0().X, jd9Var);
                    hc2 hc2VarY0 = chatAdminsScreen.y0();
                    ArrayList arrayList = hc2VarY0.t0;
                    int size = arrayList.size();
                    arrayList.clear();
                    xfh.r(hc2VarY0.u0, new qjc(new p5g(x8b.t2, ys.D(new Object[]{Integer.valueOf(size)}))));
                    break;
                }
            case 5:
            case 6:
            case 9:
            default:
                tw3 tw3Var = (tw3) obj;
                if (ew3.$EnumSwitchMapping$0[ecbVar.ordinal()] == 1) {
                    svi.e(tw3Var.a, ((q2b) tw3Var.q()).b().plus(bia.a), null, new dw3(tw3Var, null), 2);
                    break;
                }
                break;
            case 7:
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) obj;
                yy7[] yy7VarArr2 = ChatMembersCompactWidget.Y;
                if (ecbVar != ecbVar2) {
                    chatMembersCompactWidget.z0().z();
                    break;
                } else {
                    xfh.r(chatMembersCompactWidget.A0().X, jd9Var);
                    chatMembersCompactWidget.z0().y();
                    break;
                }
            case 8:
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                yy7[] yy7VarArr3 = ChatMembersScreen.t0;
                if (ecbVar != ecbVar2) {
                    chatMembersScreen.z0().z();
                    break;
                } else {
                    xfh.r(chatMembersScreen.A0().X, jd9Var);
                    chatMembersScreen.z0().y();
                    break;
                }
            case 10:
                ((ixe) ((e13) obj)).b.invoke(ecbVar);
                break;
        }
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ExtraResolver
    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return ((MultiEventListener) this.b).onExternalByInternalResolution(conversationParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MeChanger
    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.b).setExternalId(participantId);
    }

    public /* synthetic */ i62(hd hdVar, PlaybackException playbackException) {
        this.a = 28;
        this.b = playbackException;
    }

    public /* synthetic */ i62(mj4 mj4Var, i3 i3Var) {
        this.a = 27;
        this.b = mj4Var;
    }
}
