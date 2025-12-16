package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class amc extends y0f {
    public final ukd X;
    public final zlc o;

    public amc(ExecutorService executorService, zlc zlcVar) {
        super(executorService);
        this.o = zlcVar;
        this.X = new ukd(29, this);
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(qmc qmcVar, int i) {
        View.OnClickListener xlcVar;
        mid midVar;
        mjc mjcVar = (mjc) ((t98) C(i));
        if (mjcVar instanceof sic) {
            final int i2 = 0;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof gjc) {
            final int i3 = 4;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof uic) {
            final int i4 = 5;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof vic) {
            final int i5 = 6;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof jjc) {
            final int i6 = 7;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof ijc) {
            final int i7 = 1;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof bjc) {
            xlcVar = new xlc(mjcVar, this);
        } else if (mjcVar instanceof ejc) {
            xlcVar = new xlc(this, mjcVar);
        } else if (mjcVar instanceof kjc) {
            final int i8 = 2;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else if (mjcVar instanceof wic) {
            final int i9 = 3;
            xlcVar = new View.OnClickListener(this) { // from class: wlc
                public final /* synthetic */ amc b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, k18] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).a(), null, new enc(pncVarD0, null), 2);
                            break;
                        case 1:
                            pnc pncVarD02 = ((ProfileScreen) this.b.o).D0();
                            Long lI = pncVarD02.T0.i();
                            if (lI != null) {
                                xfh.r(pncVarD02.F0, new pkc(lI.longValue(), br2.MEMBER));
                                break;
                            }
                            break;
                        case 2:
                            xfh.r(((ProfileScreen) this.b.o).D0().E0, jmc.a);
                            break;
                        case 3:
                            pnc pncVarD03 = ((ProfileScreen) this.b.o).D0();
                            l5c l5cVar = (l5c) ((age) pncVarD03.w0.getValue());
                            l5cVar.getClass();
                            long jM = l5cVar.m(PmsKey.f25channelstatisticsbotid, 0L);
                            Long lI2 = pncVarD03.T0.i();
                            if (lI2 != null) {
                                long jLongValue = lI2.longValue();
                                ci5 ci5Var = pncVarD03.F0;
                                kkc.c.getClass();
                                xc0.l(":webapp:root?bot_id=" + jM + "&entry_point=chat_profile&chat_id=" + jLongValue, ci5Var);
                                break;
                            }
                            break;
                        case 4:
                            pnc pncVarD04 = ((ProfileScreen) this.b.o).D0();
                            Long lI3 = pncVarD04.T0.i();
                            if (lI3 != null) {
                                xfh.r(pncVarD04.F0, new tkc(lI3.longValue()));
                                break;
                            }
                            break;
                        case 5:
                            pnc pncVarD05 = ((ProfileScreen) this.b.o).D0();
                            Long lI4 = pncVarD05.T0.i();
                            if (lI4 != null) {
                                xfh.r(pncVarD05.F0, new pkc(lI4.longValue(), br2.ADMIN));
                                break;
                            }
                            break;
                        case 6:
                            pnc pncVarD06 = ((ProfileScreen) this.b.o).D0();
                            pncVarD06.H0.O(pncVarD06, pnc.X0[1], svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b(), null, new vmc(pncVarD06, null), 2));
                            break;
                        default:
                            pnc pncVarD07 = ((ProfileScreen) this.b.o).D0();
                            xfh.r(pncVarD07.E0, new imc((List) ((idc) pncVarD07.K0.getValue()).l.getValue()));
                            break;
                    }
                }
            };
        } else {
            xlcVar = null;
        }
        View.OnLongClickListener bn0Var = mjcVar instanceof jjc ? new bn0(4, this) : null;
        qmcVar.z(mjcVar);
        if ((mjcVar instanceof xic) || (mjcVar instanceof djc)) {
            qmcVar.G(this.X);
        } else if (mjcVar instanceof gjc) {
            boolean z = qmcVar instanceof r88;
            r88 r88Var = z ? (r88) qmcVar : null;
            if (r88Var != null) {
                ((q88) r88Var.a).setOnShareLinkClickListener(new wu7(5, new ylc(this, 0)));
            }
            midVar = z ? (r88) qmcVar : null;
            if (midVar != null) {
                ((q88) midVar.a).setOnShareQrCodeClickListener(new fr7(6, new ffb(19, this)));
            }
        } else if (mjcVar instanceof ric) {
            midVar = qmcVar instanceof wza ? (wza) qmcVar : null;
            if (midVar != null) {
                ((vza) midVar.a).setListener(new xu9(8, new ylc(this, 1)));
            }
        }
        if (xlcVar != null) {
            qmcVar.H(xlcVar);
        }
        if (bn0Var != null) {
            qmcVar.I(bn0Var);
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((mjc) ((t98) C(i))).getK0();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = 268435455 & i;
        if (i2 == 1) {
            vza vzaVar = new vza(viewGroup.getContext());
            wza wzaVar = new wza(vzaVar);
            vzaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return wzaVar;
        }
        Continuation continuation = null;
        if (i2 == 2) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
            a20 a20Var = new a20(oneMeButton, 7);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return a20Var;
        }
        if (i2 == 4) {
            return new a20(viewGroup.getContext());
        }
        if (i2 == 65536) {
            return new a20(new l04(viewGroup.getContext()), 4);
        }
        if (i2 == 8) {
            return new a20(new du2(viewGroup.getContext()), 2);
        }
        if (i2 == 16) {
            roe roeVar = new roe(viewGroup.getContext(), 0);
            a20 a20Var2 = new a20(roeVar, 9);
            roeVar.setId(v8b.i1);
            return a20Var2;
        }
        if (i2 == 4096) {
            TextView textView = new TextView(viewGroup.getContext());
            a20 a20Var3 = new a20(textView, 5);
            a20Var3.F();
            textView.setId(v8b.A);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setGravity(16);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            dpg.h.b(textView, t75.b);
            tqi.c(new x9(3, null, 12), textView);
            return a20Var3;
        }
        if (i2 == 32) {
            TextView textView2 = new TextView(viewGroup.getContext());
            a20 a20Var4 = new a20(textView2, 6);
            a20Var4.F();
            textView2.setId(v8b.W);
            textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView2.setTextAlignment(5);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            dpg.h.b(textView2, t75.b);
            Drawable drawableMutate = r34.b(textView2.getContext(), yud.Q1).mutate();
            float f = 20;
            drawableMutate.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
            textView2.setCompoundDrawablePadding(kti.d(4 * vw4.d().getDisplayMetrics().density));
            textView2.setCompoundDrawablesRelative(null, null, drawableMutate, null);
            tqi.c(new s3(drawableMutate, continuation, 14), textView2);
            return a20Var4;
        }
        if (i2 == 32768) {
            return new r88(new q88(viewGroup.getContext()));
        }
        if (i2 == 64) {
            return new bc(viewGroup.getContext(), 0);
        }
        yne yneVar = yne.a;
        if (i2 == 256) {
            roe roeVar2 = new roe(viewGroup.getContext(), 0);
            a20 a20Var5 = new a20(roeVar2, 0);
            roeVar2.setModelItem(new toe(256, 0, new n5g(x8b.j), null, new n5g(x8b.k), baj.a(yud.e1), yneVar, null, null, 264));
            return a20Var5;
        }
        if (i2 == 128) {
            return new bc(viewGroup.getContext(), 1);
        }
        if (i2 == 512) {
            v0b v0bVar = new v0b(viewGroup.getContext(), false);
            a20 a20Var6 = new a20(v0bVar, 3);
            tqi.c(new zh3(3, null, 0), v0bVar);
            return a20Var6;
        }
        if (i2 == 2048) {
            return new bc(viewGroup.getContext(), 3);
        }
        if (i2 == 1024) {
            dwe dweVar = new dwe(viewGroup.getContext());
            dweVar.setShimmerBackground(cwe.a);
            return new a20(dweVar, 11);
        }
        if (i2 == 131072) {
            return new bc(viewGroup.getContext(), 2);
        }
        if (i2 == 262144) {
            roe roeVar3 = new roe(viewGroup.getContext(), 0);
            a20 a20Var7 = new a20(roeVar3, 1);
            roeVar3.setModelItem(new toe(262144, 0, new n5g(x8b.E), null, null, baj.a(ivd.f), yneVar, null, null, 280));
            return a20Var7;
        }
        if (i2 != 524288) {
            throw new IllegalStateException(("unknown item view type " + i + "}").toString());
        }
        roe roeVar4 = new roe(viewGroup.getContext(), 0);
        a20 a20Var8 = new a20(roeVar4, 8);
        roeVar4.setModelItem(new toe(524288, 0, new n5g(x8b.M), hoe.c, new n5g(x8b.L), baj.a(ivd.L1), null, null, null, 320));
        return a20Var8;
    }
}
