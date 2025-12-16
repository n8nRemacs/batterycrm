package com.avito.android.remote;

import com.avito.android.remote.model.AIDescription;
import com.avito.android.remote.model.CategoriesSuggestResponse;
import com.avito.android.remote.model.CpaContactInfoResponse;
import com.avito.android.remote.model.FashionAuthenticationBannerResponse;
import com.avito.android.remote.model.ImageGroupResponse;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PaginationSelectedResponse;
import com.avito.android.remote.model.Pretend;
import com.avito.android.remote.model.PublishAnonymousNumber;
import com.avito.android.remote.model.PublishDraftResponse;
import com.avito.android.remote.model.PublishParamsSendingResult;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.remote.model.SaveDraftResponse;
import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.VideoPreview;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.adverts.PostAdvertResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishResponse;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.CptEstimateResultV2;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.CptEstimateEditResultV2;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestResponse;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueResponse;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinResponse;
import com.avito.android.remote.model.fees.FeePaidInfo;
import com.avito.android.remote.model.fees.FeePricingParamsResponse;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import com.avito.android.remote.model.job_premoderation.VacancySimilarItemResponse;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.publish.EditAdvertResult;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResult;
import com.avito.android.remote.model.suggests.ParamsSuggestResponse;
import com.avito.android.remote.model.suggests.TitleSuggestsResponse;
import com.avito.android.remote.model.video_upload.CreateFileIdResponse;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

/* compiled from: PublishApi.kt */
@Metadata(d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JI\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u0007H'¢\u0006\u0004\b\u0012\u0010\u0013Ji\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00032\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u001a\u0010\u001bJi\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00032\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u001c\u0010\u001bJ\u0083\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b!\u0010\"J\u0083\u0001\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b#\u0010\"J\u008b\u0001\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b&\u0010'J\u008b\u0001\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b(\u0010'J[\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0+2\b\b\u0001\u0010)\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b,\u0010-J[\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u00072\b\b\u0001\u0010/\u001a\u00020.2\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b1\u00102JU\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00072\b\b\u0001\u0010/\u001a\u00020.2\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b4\u00102JQ\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0+2\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b5\u00106JQ\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0+2\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b7\u00106JK\u00109\u001a\b\u0012\u0004\u0012\u0002080+2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\b9\u0010:JK\u0010;\u001a\b\u0012\u0004\u0012\u0002080+2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\b;\u0010:J;\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\b0\u00072\b\b\u0001\u0010<\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010=H'¢\u0006\u0004\b?\u0010@J]\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\b0\u00072\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\bB\u0010CJ]\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\b0\u00072\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\bD\u0010CJ[\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\b0\u00072\b\b\u0001\u0010E\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\bG\u0010HJ}\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010J\u001a\u00020\u00162\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\bK\u0010LJi\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\b0\u00072\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\bN\u0010OJ}\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\bQ\u0010RJ3\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010S\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\bU\u0010VJ]\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0+2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\bX\u0010YJ]\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\b0\u00072\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\b[\u0010CJ]\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0\b0+2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\b]\u0010YJ\u001b\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\b0\u0007H'¢\u0006\u0004\b_\u0010\u0013J\u001b\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0\b0\u0007H'¢\u0006\u0004\ba\u0010\u0013J·\u0001\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010b\u001a\u00020\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010I\u001a\u0004\u0018\u00010=2\n\b\u0003\u0010f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010g\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\bi\u0010jJ%\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\b0+2\b\b\u0001\u0010k\u001a\u00020\u0003H'¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u0007H'¢\u0006\u0004\bp\u0010\u0013J3\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u00072\b\b\u0001\u0010k\u001a\u00020\u00032\b\b\u0001\u0010q\u001a\u00020\u00032\b\b\u0001\u0010r\u001a\u00020.H'¢\u0006\u0004\bt\u0010uJ\u001b\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\b0\u0007H'¢\u0006\u0004\bw\u0010\u0013J\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\bH§@¢\u0006\u0004\by\u0010zJM\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u00072\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b|\u0010}JR\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0\b0\u00072\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010~\u001a\u00020\u00032\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001Js\u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010\b0\u00072\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010~\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\u00032\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u00032\t\b\u0001\u0010\u0083\u0001\u001a\u00020\u0003H'¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0080\u0001\u0010\u008b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010<\u001a\u00020\u00032\t\b\u0001\u0010\u0087\u0001\u001a\u00020=2\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u00032\t\b\u0001\u0010\u0089\u0001\u001a\u00020=2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J#\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\u00072\b\b\u0001\u0010\r\u001a\u00020\u0003H'¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J>\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010\b0+2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J%\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\t\b\u0001\u0010\u0094\u0001\u001a\u00020\u0003H§@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JI\u0010\u0099\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0098\u00010\b0\u00072\b\b\u0001\u0010k\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001Jl\u0010\u009d\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u00010\b0\u00072\b\b\u0001\u0010k\u001a\u00020\u00032\u0015\b\u0001\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001JB\u0010¡\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00010\b0\u00072\b\b\u0001\u0010k\u001a\u00020\u00032\u0017\b\u0001\u0010\u009f\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0006\b¡\u0001\u0010¢\u0001J.\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010+2\t\b\u0001\u0010£\u0001\u001a\u00020\u00032\b\b\u0001\u0010/\u001a\u00020.H'¢\u0006\u0006\b¥\u0001\u0010¦\u0001J.\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010+2\t\b\u0001\u0010£\u0001\u001a\u00020\u00032\b\b\u0001\u0010e\u001a\u00020\u0003H'¢\u0006\u0006\b¨\u0001\u0010©\u0001J$\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030ª\u00010\b2\b\b\u0001\u0010\u001e\u001a\u00020\u0003H§@¢\u0006\u0006\b«\u0001\u0010\u0097\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/avito/android/remote/H0;", "", "", "", "rawParams", "publishSessionId", "categoryId", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/AIDescription;", "l", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "locationJwt", "itemId", "Lcom/avito/android/remote/model/fees/FeePaidInfo;", "J", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/fees/FeePricingParamsResponse;", "E", "()Lio/reactivex/rxjava3/core/I;", "navigation", "stepId", "", "forceErrorChecking", "scenario", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "A", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "D", "params", "draftId", "targetStepType", "needRootNavigation", "H", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "I", "slots", "isNeedTargetStep", "s", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "v", "vin", "paramsAndSlots", "Lio/reactivex/rxjava3/core/z;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "Lokhttp3/MultipartBody$Part;", "file", "Lcom/avito/android/remote/model/StsRecognitionResult;", "O", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "R", "m", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "L", "Lcom/avito/android/remote/model/CategoriesSuggestResponse;", "r", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "q", "query", "", "Lcom/avito/android/remote/model/suggests/TitleSuggestsResponse;", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult;", "C", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "z", "phone", "Lcom/avito/android/remote/model/PublishAnonymousNumber;", "B", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "version", "phoneOnly", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/adverts/PostAdvertResult;", "Q", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/publish/EditAdvertResult;", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "action", "Lcom/avito/android/remote/model/ItemBrief;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse;", "g", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;", "T", "Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishResponse;", "M", "Lcom/avito/android/remote/model/PublishDraftResponse;", "V", "Lcom/avito/android/remote/model/PublishStartInfo;", "i", "deviceId", Navigation.ATTRIBUTES, VoiceInfo.STATE, "id", "activeFieldId", "needsResultMessage", "Lcom/avito/android/remote/model/SaveDraftResponse;", "P", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/I;", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/VideoPreview;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/video_upload/CreateFileIdResponse;", "d", "fileId", "video", "Lokhttp3/ResponseBody;", "j", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/WizardParameter;", "x", "Lcom/avito/android/remote/model/CpaContactInfoResponse;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/suggests/ParamsSuggestResponse;", "S", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "price", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CptEstimateResultV2;", "F", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "title", "description", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/CptEstimateEditResultV2;", "G", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "offset", "fieldId", "limit", "Lcom/avito/android/remote/model/PaginationSelectedResponse;", "e", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/FashionAuthenticationBannerResponse;", "h", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", AddressParameter.Value.JSON_WEB_TOKEN, "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Ok;", "U", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "imageId", "Lcom/avito/android/remote/model/ImageGroupResponse;", "u", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/category_parameters/slot/final_state_suggest/FinalStateSuggestResponse;", "N", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "analyticsParams", "Lcom/avito/android/remote/model/category_parameters/slot/universal_beduin/UniversalBeduinResponse;", "t", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "body", "Lcom/avito/android/remote/model/PublishParamsSendingResult;", "w", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "path", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "b", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/job_premoderation/VacancySimilarItemResponse;", "k", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface H0 {

    /* compiled from: PublishApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("15/dicts/parameters")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> A(@J81.c("itemId") @Y61.k String itemId, @J81.d @Y61.k Map<String, String> navigation2, @J81.c("stepId") @Y61.l String stepId, @J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("forceErrorChecking") @Y61.l Boolean forceErrorChecking, @J81.c("scenario") @Y61.l String scenario);

    @J81.o("3/anonymousNumber/check")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PublishAnonymousNumber>> B(@J81.c("phone") @Y61.k String phone, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.o("4/items/check/proactiveModeration")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<AdvertProactiveModerationResult>> C(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("draftId") @Y61.l String draftId);

    @J81.o("16/dicts/parameters")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> D(@J81.c("itemId") @Y61.k String itemId, @J81.d @Y61.k Map<String, String> navigation2, @J81.c("stepId") @Y61.l String stepId, @J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("forceErrorChecking") @Y61.l Boolean forceErrorChecking, @J81.c("scenario") @Y61.l String scenario);

    @J81.f("1/fees/pricing-params")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<FeePricingParamsResponse>> E();

    @J81.o("2/cpt/estimate")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CptEstimateResultV2>> F(@J81.t("locationJwt") @Y61.k String locationJwt, @J81.t("categoryId") @Y61.k String categoryId, @J81.t("price") @Y61.k String price, @J81.u @Y61.k Map<String, String> params);

    @J81.o("2/cpt/estimate/edit")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CptEstimateEditResultV2>> G(@J81.t("locationJwt") @Y61.k String locationJwt, @J81.t("categoryId") @Y61.k String categoryId, @J81.t("price") @Y61.k String price, @J81.u @Y61.k Map<String, String> rawParams, @J81.t("itemId") @Y61.k String itemId, @J81.t("title") @Y61.k String title, @J81.t("description") @Y61.k String description);

    @J81.o("15/dicts/parameters")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> H(@J81.c("publishSessionId") @Y61.l String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("draftId") @Y61.l String draftId, @J81.c("targetStepType") @Y61.l String targetStepType, @J81.c("needRootNavigation") @Y61.l Boolean needRootNavigation, @J81.c("scenario") @Y61.l String scenario);

    @J81.o("16/dicts/parameters")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> I(@J81.c("publishSessionId") @Y61.l String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("draftId") @Y61.l String draftId, @J81.c("targetStepType") @Y61.l String targetStepType, @J81.c("needRootNavigation") @Y61.l Boolean needRootNavigation, @J81.c("scenario") @Y61.l String scenario);

    @J81.o("1/fees/paidInfo")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<FeePaidInfo>> J(@J81.c("locationJwt") @Y61.l String locationJwt, @J81.d @Y61.k Map<String, String> rawParams, @J81.c("itemId") @Y61.l String itemId, @J81.c("categoryId") @Y61.k String categoryId);

    @J81.o("19/profile/item/{itemId}/edit")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<EditAdvertResult>> K(@J81.s("itemId") @Y61.k String itemId, @J81.c("categoryId") @Y61.k String categoryId, @J81.d @Y61.k Map<String, String> navigation2, @J81.c("version") @Y61.l String version, @J81.d @Y61.k Map<String, String> paramsAndSlots, @J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("scenario") @Y61.l String scenario);

    @J81.o("1/realty/suggest/by_address")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<CategoryParameters>> L(@J81.t("publishSessionId") @Y61.k String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> paramsAndSlots);

    @J81.o("1/autoPublish/check")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<AutoPublishResponse>> M(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("itemId") @Y61.l String itemId, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.o
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<FinalStateSuggestResponse>> N(@J81.y @Y61.k String url, @J81.c("categoryId") @Y61.k String categoryId, @J81.d @Y61.k Map<String, String> params);

    @J81.o("4/publish/parameters/suggest/by_sts")
    @J81.l
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<StsRecognitionResult>> O(@J81.q @Y61.k MultipartBody.Part file, @J81.t("publishSessionId") @Y61.k String publishSessionId, @J81.u @Y61.k Map<String, String> navigation2, @J81.u @Y61.k Map<String, String> paramsAndSlots);

    @J81.o("1/item/draft/save")
    @J81.e
    @Y61.k
    @com.avito.android.retrofit.v
    io.reactivex.rxjava3.core.I<TypedResult<SaveDraftResponse>> P(@J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("deviceId") @Y61.k String deviceId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> attributes, @J81.d @Y61.k Map<String, String> slots, @J81.d @Y61.k Map<String, String> state, @J81.c("id") @Y61.l String id2, @J81.c("version") @Y61.l Integer version, @J81.c("activeFieldId") @Y61.l String activeFieldId, @J81.c("needsResultMessage") @Y61.l Boolean needsResultMessage);

    @J81.o("21/items/add")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Pretend
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PostAdvertResult>> Q(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> paramsAndSlots, @J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("draftId") @Y61.l String draftId, @J81.c("scenario") @Y61.l String scenario);

    @J81.o("2/items/device-verification/phone/imei/photo/scan")
    @J81.l
    @Y61.k
    io.reactivex.rxjava3.core.I<ImeiRecognitionResult> R(@J81.q @Y61.k MultipartBody.Part file, @J81.t("publishSessionID") @Y61.k String publishSessionId, @J81.u @Y61.k Map<String, String> navigation2, @J81.u @Y61.k Map<String, String> paramsAndSlots);

    @J81.o("1/params/suggest")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<ParamsSuggestResponse> S(@J81.c("publishSessionId") @Y61.l String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params);

    @J81.o("1/item/getIMVData")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<InstantMarketValueResponse>> T(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("itemId") @Y61.l String itemId, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.o("1/realty-commercial-status/check-submission")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<RealtyAddressSubmissionResult.Ok>> U(@J81.c("geohash") @Y61.k String jwt, @J81.c("categoryId") @Y61.k String categoryId, @J81.c("rawParams") @Y61.k String rawParams);

    @J81.f("1/item/draft/getInitialDialog")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PublishDraftResponse>> V();

    @J81.f("1/video")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<VideoPreview>> a(@J81.t(ContextActionHandler.Link.URL) @Y61.k String url);

    @J81.o("{uploadPath}")
    @J81.l
    @Y61.k
    io.reactivex.rxjava3.core.z<FileUploadResult> b(@J81.s(encoded = true, value = "uploadPath") @Y61.k String path, @J81.q @Y61.k MultipartBody.Part file);

    @J81.o("{deletePath}")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<FileDeleteResult> c(@J81.s(encoded = true, value = "deletePath") @Y61.k String path, @J81.c("fileId") @Y61.k String id2);

    @J81.o("1/video/create")
    @Y61.k
    io.reactivex.rxjava3.core.I<CreateFileIdResponse> d();

    @J81.o("2/dicts/parameters/filter")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PaginationSelectedResponse>> e(@J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("query") @Y61.k String query, @J81.c("offset") int offset, @J81.c("fieldId") @Y61.k String fieldId, @J81.c("limit") int limit, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params);

    @J81.o("1/developments-advice/getContactInfo")
    @Y61.l
    Object f(@Y61.k Continuation<? super TypedResult<CpaContactInfoResponse>> continuation);

    @J81.o("1/item/publish/getIMVPrice")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<MarketPriceResponse>> g(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("itemId") @Y61.l String itemId, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.f("1/fashion-auth/notification-banner/{itemId}")
    @Y61.k
    io.reactivex.rxjava3.core.I<FashionAuthenticationBannerResponse> h(@J81.s("itemId") @Y61.k String itemId);

    @J81.f("1/publish/getInitialDialog")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PublishStartInfo>> i();

    @J81.o
    @J81.l
    @InterfaceC42830m
    @J81.k({"forceAsQuery: true"})
    @Y61.k
    io.reactivex.rxjava3.core.I<ResponseBody> j(@J81.y @Y61.k String url, @J81.t("id") @Y61.k String fileId, @J81.q @Y61.k MultipartBody.Part video);

    @J81.f("1/job/vacancies/similarItems")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @Y61.l
    Object k(@J81.t("draftId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<VacancySimilarItemResponse>> continuation);

    @J81.o("1/llm/generate_description")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<AIDescription>> l(@J81.d @Y61.k Map<String, String> rawParams, @J81.c("publishSessionId") @Y61.l String publishSessionId, @J81.c("categoryId") @Y61.l String categoryId);

    @J81.o("1/publish/parameters/suggest/by_geo")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<CategoryParameters>> m(@J81.t("publishSessionId") @Y61.k String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> paramsAndSlots);

    @J81.o("2/profile/item/{itemId}/brief")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<ItemBrief> n(@J81.s("itemId") @Y61.k String itemId, @J81.c("action") @Y61.k String action, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.o("1/publish/title/suggest")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<TitleSuggestsResponse>> o(@J81.c("query") @Y61.k String query, @J81.c("esid") @Y61.k String publishSessionId, @J81.c("categoryId") @Y61.l Integer categoryId);

    @J81.o("4/publish/parameters/suggest/by_vin")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<CategoryParameters>> p(@J81.t("vin") @Y61.k String vin, @J81.t("publishSessionId") @Y61.k String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> paramsAndSlots);

    @J81.o("6/publish/categories/suggest/by_params")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<CategoriesSuggestResponse> q(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.o("5/publish/categories/suggest/by_params")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.z<CategoriesSuggestResponse> r(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("publishSessionId") @Y61.k String publishSessionId);

    @J81.o("15/dicts/parameters")
    @J81.e
    @InterfaceC42830m
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> s(@J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.d @Y61.k Map<String, String> slots, @J81.c("needsTargetStep") @Y61.l Boolean isNeedTargetStep, @J81.c("forceErrorChecking") @Y61.l Boolean forceErrorChecking, @J81.c("scenario") @Y61.l String scenario);

    @J81.o
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<UniversalBeduinResponse>> t(@J81.y @Y61.k String url, @J81.d @Y61.k Map<String, String> analyticsParams, @J81.d @Y61.k Map<String, String> params, @J81.d @Y61.k Map<String, String> navigation2);

    @J81.f("1/score/{imageId}")
    @Y61.l
    Object u(@J81.s("imageId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<ImageGroupResponse>> continuation);

    @J81.o("16/dicts/parameters")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> v(@J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.d @Y61.k Map<String, String> slots, @J81.c("needsTargetStep") @Y61.l Boolean isNeedTargetStep, @J81.c("forceErrorChecking") @Y61.l Boolean forceErrorChecking, @J81.c("scenario") @Y61.l String scenario);

    @J81.o
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PublishParamsSendingResult>> w(@J81.y @Y61.k String url, @J81.d @Y61.k Map<String, String> body);

    @J81.o("1/dicts/navigation")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<WizardParameter>> x();

    @J81.o("3/anonymousNumber/check")
    @J81.e
    @J81.k({"X-Geo-required: true"})
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<PublishAnonymousNumber>> y(@J81.c("itemId") @Y61.k String itemId, @J81.c("categoryId") @Y61.k String categoryId, @J81.d @Y61.k Map<String, String> navigation2, @J81.c("phone") @Y61.l String phone, @J81.c("version") @Y61.l String version, @J81.c("phoneOnly") boolean phoneOnly, @J81.d @Y61.k Map<String, String> params);

    @J81.o("5/items/check/proactiveModeration")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<AdvertProactiveModerationResult>> z(@J81.d @Y61.k Map<String, String> navigation2, @J81.d @Y61.k Map<String, String> params, @J81.c("publishSessionId") @Y61.k String publishSessionId, @J81.c("draftId") @Y61.l String draftId);
}
